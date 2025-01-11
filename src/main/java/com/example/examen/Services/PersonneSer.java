package com.example.examen.Services;

import com.example.examen.Repo.PersonneRepo;
import com.example.examen.entities.Personne;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class PersonneSer {
    private PersonneRepo personneRepo;
    public Personne creer(String nom, Date birth, String genrel) {
        Personne personne = new Personne();
        personne.setGenre(genrel);
        personne.setNom(nom);
        personne.setDateNaissance(birth);
        personneRepo.save(personne);
        return personne;
    }
    public Personne modif(String nom, Date birth, String genrel) {
        Personne personne = personneRepo.findByNom(nom);
        personne.setDateNaissance(birth);
        personne.setGenre(genrel);
        personneRepo.save(personne);
        return personne;
    }
    public Personne affichier(int id) {
        Personne personne = personneRepo.findById(id).get();
        return personne;
    }
    public Date age(int id) {
        Personne personne = personneRepo.findById(id).get();
        return personne.getDateNaissance();
    }

}
