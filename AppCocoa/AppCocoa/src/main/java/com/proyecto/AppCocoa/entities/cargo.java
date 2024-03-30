package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cargos")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "Id_cargo",unique = true)
    private long id;

    @Column(name="tipo_cargo",length = 30,nullable = false)
    private String tipo_cargo;

    @Column(name="descipcion",length = 50,nullable = false)
    private String descripcion;


}
