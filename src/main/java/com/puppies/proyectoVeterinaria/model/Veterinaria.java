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
public class Veterinaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    private String cuit;
    private String adress;
    private String phone;

//    //RELACIONES
//
//    @OneToMany(mappedBy = "veterinaria", fetch = FetchType.LAZY)
//    private List<Cliente> clientes;


    //CONSTRUCTOR
    public Veterinaria(){
        this.name = "";
        this.cuit = "";
        this.adress = "";
        this.phone = "";
    }


}