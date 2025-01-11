package com.example.examen.entities;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  numImatricilation ;

    private Date dateMiseEnService ;
    private double poids;
    @OneToMany(mappedBy = "bus")
    private List<Lyceen> lyceens = new ArrayList<>();
    @OneToOne(mappedBy = "bus")
    private Conducteur conducteur;
    @OneToMany(mappedBy = "bus")
    private List<Vitre> vitres = new ArrayList<>();
    @OneToMany(mappedBy = "bus")
    private List<Siege> sieges = new ArrayList<>();
    @OneToMany(mappedBy = "bus")
    List<Roue> roues = new ArrayList<>();
    @OneToOne(mappedBy = "bus")
    Carrosserie carrosserie;

    public Bus(Long numImatricilation, Date dateMiseEnService, double poids) {
        this.numImatricilation = numImatricilation;
        this.dateMiseEnService = dateMiseEnService;
        this.poids = poids;
    }

    public Bus(Long num) {
        this.numImatricilation = num;
    }

    public Bus() {

    }

    public Date getDateMiseEnService() {
        return dateMiseEnService;
    }

    public void setDateMiseEnService(Date dateMiseEnService) {
        this.dateMiseEnService = dateMiseEnService;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Long getNumImatricilation() {
        return numImatricilation;
    }

    public void setNumImatricilation(Long numImatricilation) {
        this.numImatricilation = numImatricilation;
    }
}
