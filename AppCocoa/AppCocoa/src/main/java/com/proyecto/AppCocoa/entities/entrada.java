package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name="entradas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_entrada",unique = true)
    private long id;
    @Column(name = "cantidad_producto",nullable = false,length = 10)
    private long cant;

    @Column(name="fecha_entrada")
    private Date startdate;

    @ManyToOne
    @JoinColumn(name = "id_orden")
    private orden_compra ordenes_compras;


}
