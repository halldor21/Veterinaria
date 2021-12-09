package com.puppies.proyectoVeterinaria.repository;

import com.puppies.proyectoVeterinaria.model.Cliente;
import com.puppies.proyectoVeterinaria.model.Veterinaria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long> {

    List<Cliente> findAll();

    Cliente findByName(String name);

    Cliente findByDni(String dni);

}
