package com.example.examen.Repo;

import com.example.examen.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonneRepo extends JpaRepository<Personne, Integer> {
    public Personne findByNom(String nom);
}
