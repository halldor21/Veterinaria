package com.puppies.proyectoVeterinaria.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MascotaDto {

    private String name;
    private String race;
    private Double weight;
    private Boolean ConfirmVaccination;

}
