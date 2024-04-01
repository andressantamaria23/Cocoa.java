package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="campesinos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class campesino {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_campesino",unique = true)
    private long id;

    @Column(name="direccion",length = 50,nullable = false)
    private String direccion;

    @Column(name="nombre_campesino",length = 70,nullable = false)
    private String name;
    @Column(name = "telefono_proveedor",length = 10,nullable = false)
    private long tel;

    @ManyToOne
    @JoinColumn(name = "fkid_contrato")
    private contrato_comercial contrato_comercial;

    @ManyToMany(mappedBy = "campesinos")
    private List<capacitacion> capacitaciones;

}
