package com.spring.Service;

import com.spring.Controller.Animal;

import java.util.Optional;

public class AnimalRepository {
    public Optional<Animal> findById(long id) {

        return Optional.empty();
    }

    public Animal save(Animal animal ) {
        return animal;
    }

    public void deleteById(long id) {
    }
}

