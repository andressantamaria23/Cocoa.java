package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="contratos_comerciales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class contrato_comercial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fkid_contrato",unique = true)
    private long id;

    @Column(name = "monto_total",nullable = false)
    private long monto;

    @Column(name = "acuerdos",length = 100,nullable = false)
    private String acuerdos;

    @ManyToOne
    @JoinColumn(name="id_contrato")
    private contrato contratos;

}
