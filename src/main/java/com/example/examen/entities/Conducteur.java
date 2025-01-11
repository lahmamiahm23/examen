package com.example.examen.entities;

import jakarta.persistence.*;

@Entity
public class Conducteur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroPermis;
    @OneToOne
    private Bus bus;
    public int getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(int numeroPermis) {
        this.numeroPermis = numeroPermis;
    }
}
