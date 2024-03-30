package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="contratos_laborales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class contrato_laboral {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fkid_contrato",unique = true)
    private long id;

    @Column(name="salario",length = 10,nullable = false)
    private long salario;

    @Column(name="funciones",length = 100,nullable = false)
    private String funciones;

    @ManyToOne
    @JoinColumn(name="id_contrato")
    private contrato contratos;

}
