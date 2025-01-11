package com.example.examen.Repo;

import com.example.examen.entities.Lyceen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LyceenRepo extends JpaRepository<Lyceen, Integer> {
}
