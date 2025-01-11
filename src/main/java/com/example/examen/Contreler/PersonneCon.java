package com.example.examen.Contreler;

import com.example.examen.Services.PersonneSer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Personnes")
public class PersonneCon {
    PersonneSer personneSer ;


}
