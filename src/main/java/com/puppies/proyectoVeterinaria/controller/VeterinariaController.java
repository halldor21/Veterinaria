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

//    @GetMapping("/prueba")
//    public Veterinaria getVeterinaria() {
//        Veterinaria v1 = new Veterinaria();
//        v1.setNombre("Cachorros");
//        v1.setDireccion("Albarellos 1016");
//        v1.setCuit("30-70924649-2");
//        return v1;
//    }

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
