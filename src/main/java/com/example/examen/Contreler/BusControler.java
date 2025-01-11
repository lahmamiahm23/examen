package com.example.examen.Contreler;

import com.example.examen.Services.BusService;
import com.example.examen.entities.Bus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController @RequestMapping("/bus")
public class BusControler {
    BusService busService;
    @PostMapping("create/{numImatricilation}")
    public Bus create(@PathVariable Long numImatricilation, double poids) {
       return busService.creerBus(numImatricilation,poids);
    }
    @PostMapping("/update/{numImatricilation}")
    public Bus update(@PathVariable Long numImatricilation, Date date, double poids) {
        return busService.modificerBus(numImatricilation,date,poids);
    }
    @GetMapping("/afficher/{numImatricilation}")
    public Bus afficher(@PathVariable Long numImatricilation) {
        return busService.afficherBus(numImatricilation);
    }
}
