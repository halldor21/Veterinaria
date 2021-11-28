package com.puppies.proyectoVeterinaria.controller;

import com.puppies.proyectoVeterinaria.repository.VeterinariaRepository;
import com.puppies.proyectoVeterinaria.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController ("/api/v1")
public class VeterinariaController {

    @Autowired
    VeterinariaService veterinariaService;


}
