package com.puppies.proyectoVeterinaria.controller;

import com.puppies.proyectoVeterinaria.dto.ClienteDto;
import com.puppies.proyectoVeterinaria.model.Cliente;
import com.puppies.proyectoVeterinaria.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/Cliente/findByName/{name}")
    public ClienteDto getClienteByName(@PathVariable String name){
        return clienteService.findClientByName(name);
    }

    @GetMapping("/Cliente/findByDni/{dni}")
    public ClienteDto getClienteByDni(@PathVariable String dni){
        ClienteDto cliente = clienteService.findClientByDni(dni);
        return cliente;
    }

    @GetMapping("/Cliente/findAll")
    public List<Cliente> findAllClients(){
        return clienteService.findAllClients();
    }


    @PostMapping("/Cliente/saveClient")
    public String saveNewCliente(@RequestBody Cliente body) {
        clienteService.saveCliente(body);
        return "Cliente cargado";
    }



}

