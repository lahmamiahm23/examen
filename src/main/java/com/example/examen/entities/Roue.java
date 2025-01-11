package com.example.examen.entities;

import jakarta.persistence.*;

@Entity
public class Roue {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;
    private double pression ;
    private double diameter ;

    public double getPression() {
        return pression;
    }

    public void setPression(double pression) {
        this.pression = pression;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
