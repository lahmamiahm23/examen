package com.example.examen.Services;

import com.example.examen.Repo.LyceenRepo;
import com.example.examen.Repo.PersonneRepo;
import com.example.examen.entities.Lyceen;
import org.springframework.stereotype.Service;

@Service
public class LyceenSE {
    LyceenRepo lyceenRepo;
    PersonneRepo personneRepo;
    public LyceenSE(LyceenRepo lyceenRepo) {
        this.lyceenRepo = lyceenRepo;
        this.personneRepo = personneRepo;

    }
    public Lyceen createLyceen(Lyceen lyceen) {
        return lyceenRepo.save(lyceen);
    }


}
