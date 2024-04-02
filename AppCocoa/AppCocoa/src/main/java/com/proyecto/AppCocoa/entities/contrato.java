package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name="contratos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_contrato",unique = true)
    private long id;

    @Column(name="fecha_inicio",nullable = false)
    private Date startdate;

    @Column(name="fecha_fin",nullable = false)
    private Date endate;

    @ManyToOne
    @JoinColumn(name = "id_documento")
    private documento documentos;
}
