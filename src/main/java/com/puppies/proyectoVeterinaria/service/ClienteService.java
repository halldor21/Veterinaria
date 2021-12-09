package com.puppies.proyectoVeterinaria.service;

import com.puppies.proyectoVeterinaria.dto.ClienteDto;
import com.puppies.proyectoVeterinaria.model.Cliente;
import com.puppies.proyectoVeterinaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ClienteDto findClientByName(String name){
        Cliente cliente = clienteRepository.findByName(name);
        return convertClienteDto(cliente);
    }

    public ClienteDto findClientByDni(String dni){
        Cliente cliente = clienteRepository.findByDni(dni);
        return convertClienteDto(cliente);
    }

    public ClienteDto convertClienteDto(Cliente cliente){
        ClienteDto cDto = new ClienteDto();
        cDto.setName(cliente.getName());
        cDto.setPhone(cliente.getPhone());
        return cDto;
    }

    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

}
