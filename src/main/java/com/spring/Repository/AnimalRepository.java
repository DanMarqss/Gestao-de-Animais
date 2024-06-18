package com.spring.Repository;

import com.spring.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
