package com.puppies.proyectoVeterinaria.service;

import com.puppies.proyectoVeterinaria.controller.VeterinariaController;
import com.puppies.proyectoVeterinaria.dto.VeterinariaDto;
import com.puppies.proyectoVeterinaria.model.Veterinaria;
import com.puppies.proyectoVeterinaria.repository.VeterinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinariaService{

    @Autowired
    VeterinariaRepository veterinariaRepository;

    public VeterinariaDto findVeterinariaByName(String name){
        Veterinaria veterinaria = veterinariaRepository.findByName(name);
        return convertVeterinariaDto(veterinaria);
    }

    public VeterinariaDto convertVeterinariaDto(Veterinaria veterinaria){
        VeterinariaDto vDto = new VeterinariaDto();
        vDto.setName(veterinaria.getName());
        vDto.setAdress(veterinaria.getAdress());
        vDto.setPhone(veterinaria.getPhone());
        return vDto;
    }

    public void saveVeterinaria(Veterinaria veterinaria) {
        veterinariaRepository.save(veterinaria);
    }

    public List<Veterinaria> findAllVets() {
        return veterinariaRepository.findAll();
    }

}
