package com.puppies.proyectoVeterinaria.controller;

import com.puppies.proyectoVeterinaria.dto.VeterinariaDto;
import com.puppies.proyectoVeterinaria.model.Veterinaria;
import com.puppies.proyectoVeterinaria.service.VeterinariaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VeterinariaController {

    VeterinariaService veterinariaService;

    @GetMapping("/findByName/{name}")
    public VeterinariaDto getVeterinariaByName(@PathVariable String name){
        return veterinariaService.findVeterinariaByName(name);
    }

    @GetMapping("/findAll")
    public List<Veterinaria> findAllVets(){
        return veterinariaService.findAllVets();
    }


    @PostMapping("/saveVet")
    public String saveNewVeterinaria(@RequestBody Veterinaria body) {    // solicitamos un body, de tipo veteri
        veterinariaService.saveVeterinaria(body);
        return "Veterinaria cargada";
    }

}
