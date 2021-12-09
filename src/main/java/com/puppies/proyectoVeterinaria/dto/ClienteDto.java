package com.puppies.proyectoVeterinaria.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClienteDto {

    private Long idVeterinaria;
    private String name;
    private String phone;

}
