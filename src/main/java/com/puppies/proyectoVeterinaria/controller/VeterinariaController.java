package com.puppies.proyectoVeterinaria.controller;

import com.puppies.proyectoVeterinaria.dto.VeterinariaDto;
import com.puppies.proyectoVeterinaria.model.Veterinaria;
import com.puppies.proyectoVeterinaria.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VeterinariaController {

    @Autowired
    VeterinariaService veterinariaService;

    @GetMapping("/findeVet/{name}")
    public VeterinariaDto getVeterinariaByName(@PathVariable String name){
        VeterinariaDto veterinaria = veterinariaService.findVeterinaria(name);
        return veterinaria;
    }

    @PostMapping("/saveVet")
    public String saveNewVeterinaria(@RequestBody Veterinaria body) {    // solicitamos un body, de tipo veteri
        veterinariaService.saveVeterinaria(body);
        return "Veterinaria cargada";
    }

}
