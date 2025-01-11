package com.example.examen.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Vitre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;
    private Long epaisseur;
    private long poids;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Long getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(Long epaisseur) {
        this.epaisseur = epaisseur;
    }

    public long getPoids() {
        return poids;
    }

    public void setPoids(long poids) {
        this.poids = poids;
    }
}
