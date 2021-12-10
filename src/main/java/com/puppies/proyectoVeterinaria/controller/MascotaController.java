package com.puppies.proyectoVeterinaria.controller;

import com.puppies.proyectoVeterinaria.dto.MascotaDto;
import com.puppies.proyectoVeterinaria.model.Mascota;
import com.puppies.proyectoVeterinaria.model.Veterinaria;
import com.puppies.proyectoVeterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    MascotaService mascotaService;

    @GetMapping("/Mascota/findByName/{name}")
    public MascotaDto getMascotaByName(@PathVariable String name){
        return mascotaService.findMascotaByName(name);
    }

    @GetMapping("/Mascota/findAll")
    public List<Mascota> findAllPets(){
        return mascotaService.findAllPets();
    }


    @PostMapping("/Mascota/savePet")
    public String saveNewPet(@RequestBody Mascota body) {
        mascotaService.saveMascota(body);
        return "Mascota cargada";
    }



}


