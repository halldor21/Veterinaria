package com.puppies.proyectoVeterinaria.service;

import com.puppies.proyectoVeterinaria.dto.VeterinariaDto;
import com.puppies.proyectoVeterinaria.repository.VeterinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinariaService{

    @Autowired
    VeterinariaRepository veterinariaRepository;


}
