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
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idCLiente;
    @NotNull
    private String nombre;
    private String raza;
    private Integer edad;
    private Double peso;

}