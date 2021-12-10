package com.puppies.proyectoVeterinaria.service;

import com.puppies.proyectoVeterinaria.dto.MascotaDto;
import com.puppies.proyectoVeterinaria.model.Mascota;
import com.puppies.proyectoVeterinaria.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {

    @Autowired
    MascotaRepository mascotaRepository;

    public MascotaDto findMascotaByName(String name){
        Mascota mascota = mascotaRepository.findByName(name);
        return convertMascotaDto(mascota);
    }

    public MascotaDto convertMascotaDto(Mascota mascota){
        MascotaDto mDto = new MascotaDto();
        mDto.setName(mascota.getName());
        mDto.setRace(mascota.getRace());
        mDto.setWeight(mascota.getWeight());
        return mDto;
    }

    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    public List<Mascota> findAllPets() {
        return mascotaRepository.findAll();
    }

}

