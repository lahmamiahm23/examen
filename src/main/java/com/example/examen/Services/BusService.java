package com.example.examen.Services;

import com.example.examen.Repo.BusRepo;
import com.example.examen.entities.Bus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class BusService {
    BusRepo busRepo;
    public BusService(BusRepo busRepo) {
        this.busRepo = busRepo;
    }
    public Bus creerBus(Long num,double poids) {
        Bus bus = new Bus(num);
        bus.setPoids(poids);
        bus.setDateMiseEnService(new Date());
        busRepo.save(bus);
        return bus;

    }
    public Bus modificerBus(Long num, Date date,double poids ) {
        Bus bus = busRepo.findByNumImatricilation(num);
        bus.setDateMiseEnService(date);
        bus.setPoids(poids);
        return bus ;
    }
    public Bus  afficherBus(Long num) {
        Bus bus = busRepo.findByNumImatricilation(num);
        return  bus;
    }
    public Date getNbAnneDeService(Bus bus) {
        bus = busRepo.findByNumImatricilation(bus.getNumImatricilation());
        return bus.getDateMiseEnService();

    }


}
