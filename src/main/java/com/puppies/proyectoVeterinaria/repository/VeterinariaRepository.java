package com.puppies.proyectoVeterinaria.repository;

//import com.puppies.proyectoVeterinaria.model.Veterinaria;
import com.puppies.proyectoVeterinaria.dto.VeterinariaDto;
import com.puppies.proyectoVeterinaria.model.Veterinaria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeterinariaRepository extends CrudRepository<Veterinaria,Long> {

    List<Veterinaria> findAll();

    Veterinaria findByName(String name);



}

