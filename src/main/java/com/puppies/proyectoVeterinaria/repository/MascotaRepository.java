package com.puppies.proyectoVeterinaria.repository;

import com.puppies.proyectoVeterinaria.model.Mascota;
import com.puppies.proyectoVeterinaria.model.Veterinaria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota,Long> {

    Mascota findByName(String name);

    List<Mascota> findAll();

}
