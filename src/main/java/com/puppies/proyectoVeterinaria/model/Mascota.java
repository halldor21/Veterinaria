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
    private String name;
    private String race;
    private Integer age;
    private Double weight;
    private Boolean isVaccinated;

    //RELACIONES
    @ManyToOne(fetch = FetchType.LAZY) //ver lazy y eager, ver el uso de cascada, ver relaciones
    @JoinColumn(name = "id_cliente", nullable = false)  //los datos de los cliente se van a sumar en esa columna
    private Cliente cliente; //nos traemos el obejeto cliente


}

