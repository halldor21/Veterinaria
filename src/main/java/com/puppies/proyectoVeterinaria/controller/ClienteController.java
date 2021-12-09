package com.puppies.proyectoVeterinaria.controller;

import com.puppies.proyectoVeterinaria.dto.ClienteDto;
import com.puppies.proyectoVeterinaria.model.Cliente;
import com.puppies.proyectoVeterinaria.model.Veterinaria;
import com.puppies.proyectoVeterinaria.service.ClienteService;
import com.puppies.proyectoVeterinaria.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/findByName/{name}")
    public ClienteDto getClienteByName(@PathVariable String name){
        ClienteDto cliente = clienteService.findClientByName(name);
        return cliente;
    }

    @GetMapping("/findByDni/{dni}")
    public ClienteDto getClienteByDni(@PathVariable String dni){
        ClienteDto cliente = clienteService.findClientByDni(dni);
        return cliente;
    }


    @PostMapping("/saveClient")
    public String saveNewCliente(@RequestBody Cliente body) {
        clienteService.saveCliente(body);
        return "Cliente cargado";
    }

}

