package com.puppies.proyectoVeterinaria.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dni;
    private String adress;
    private String phone;

    //RELACION
    @OneToMany(mappedBy = "cliente" ,fetch = FetchType.LAZY)
    private List<Mascota> mascotas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_veterinaria", nullable = false)
    private Veterinaria veterinaria;


    //CONSTRUCTOR
    public Cliente(){
        this.name = "";
        this.dni = "";
        this.adress = "";
        this.phone = "";
    }


}
