package com.spring.Controller;

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
}
