package com.spring.Controller;

import com.spring.Model.Animal;
import com.spring.Service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import java.util.Optional;

@RestController
@RequestMapping("/api/animais")
@Validated
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/{animalId}")
    public ResponseEntity<?> getAnimalById(
            @PathVariable @Positive(message = "O ID do animal deve ser um número positivo") Long animalId) {

        Optional<Animal> animalOpt = animalService.findById(animalId);
        if (animalOpt.isPresent()) {
            return ResponseEntity.ok(animalOpt.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Animal não encontrado com o ID: " + animalId);
        }
    }

    @PostMapping
    public ResponseEntity<Animal> createAnimal(@Valid @RequestBody Animal animal) {
        Animal savedAnimal = animalService.save(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAnimal);
    }

    @DeleteMapping("/{animalId}")
    public ResponseEntity<?> deleteAnimal(
            @PathVariable @Positive(message = "O ID do animal deve ser um número positivo") Long animalId) {

        Optional<Animal> animalOpt = animalService.findById(animalId);
        if (animalOpt.isPresent()) {
            animalService.deleteById(animalId);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Animal não encontrado com o ID: " + animalId);
        }

    }
    @PutMapping("/{animalId}")
    public ResponseEntity<?> updateAnimal(
            @PathVariable @Positive(message = "O ID do animal deve ser um número positivo") Long animalId,
            @Valid @RequestBody Animal updatedAnimal) {

        Optional<Animal> existingAnimalOpt = animalService.findById(animalId);
        if (existingAnimalOpt.isPresent()) {
            Animal existingAnimal = existingAnimalOpt.get();

            // Atualiza os dados do animal existente com os dados fornecidos na solicitação
            existingAnimal.setNome(updatedAnimal.getName());
            existingAnimal.setIdade(updatedAnimal.getIdade());
            // Adicione mais campos conforme necessário

            // Salva o animal atualizado
            Animal savedAnimal = animalService.save(existingAnimal);

            return ResponseEntity.ok(savedAnimal);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Animal não encontrado com o ID: " + animalId);
        }
    }

}
