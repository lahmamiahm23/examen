package com.example.examen.Services;

import com.example.examen.Repo.ConducteurRepo;
import com.example.examen.entities.Conducteur;
import org.springframework.stereotype.Service;

@Service
public class ConductorService {
    ConducteurRepo conducteurRepo;
    public ConductorService(ConducteurRepo conducteurRepo) {
        this.conducteurRepo = conducteurRepo;
    }
    public Conducteur creer(int id) {
        Conducteur c = new Conducteur();
        c.setNumeroPermis(id);
        return conducteurRepo.save(c);
    }
    public Conducteur update(int id) {
        Conducteur c = conducteurRepo.getOne(id);
        c.setNumeroPermis(id);
        return conducteurRepo.save(c);
    }
    public Conducteur afficher(int id) {
        Conducteur c = conducteurRepo.getOne(id);
        return c;
    }

}
