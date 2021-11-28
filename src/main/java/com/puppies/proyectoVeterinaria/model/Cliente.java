package com.puppies.proyectoVeterinaria.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@ToString
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idVeterinaria;
    @NotNull
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;

}
