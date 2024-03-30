package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name="inventarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_inventario",unique = true)
    private long id;

    @Column(name = "producto",length = 10,nullable = false)
    private String producto;
    @Column(name="cantidad_prodcuto",nullable = false)
    private long cant;
    @Column(name="fecha_vencimiento",nullable = false)
    private Date datef;

    @ManyToOne
    @JoinColumn(name="id_entrada")
    private entrada entradas;

    @ManyToOne
    @JoinColumn(name="id_salida")
    private salida salidas;

}
