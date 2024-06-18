package com.spring.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Entity
public class Animal {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Espécie é obrigatória")
    private String especie;

    @NotBlank(message = "Raça é obrigatória")
    private String raca;

    @NotNull(message = "Idade é obrigatória")
    @Min(value = 0, message = "Idade deve ser um valor positivo")
    private Integer idade;

    @NotBlank(message = "Estado de saúde é obrigatório")
    private String saude;

    @NotBlank(message = "Localização é obrigatória")
    private String localizacao;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {

    }

    // Getters e setters
}
