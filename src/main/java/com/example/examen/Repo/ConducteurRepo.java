package com.example.examen.Repo;

import com.example.examen.entities.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConducteurRepo extends JpaRepository<Conducteur, Integer> {
}
