package com.example.examen.Repo;

import com.example.examen.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepo extends JpaRepository<Bus, Long> {
    public Bus findByNumImatricilation(long numImatricilation);
}
