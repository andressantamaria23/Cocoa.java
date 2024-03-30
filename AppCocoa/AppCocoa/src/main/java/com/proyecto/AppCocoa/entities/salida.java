package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name="salidas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class salida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_salida",unique = true)
    private long id;
    @Column(name = "cantidad_producto",nullable = false)
    private long cant;
    @Column(name="fecha_salida",nullable = false)
    private Date date;

}
