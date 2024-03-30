package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name="ordenes_compras")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class orden_compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_orden",unique = true)
    private long id;

    @Column(name = "cantidad_producto",nullable = false)
    private long cantidad;

    @Column(name="fecha_compra")
    private Date date;
    @Column(name="valor_compra")
    private long value;

    @ManyToOne
    @JoinColumn(name="id_documento")
    private documento documentos;

    @ManyToOne
    @JoinColumn(name="id_campesino")
    private campesino campesinos;

}
