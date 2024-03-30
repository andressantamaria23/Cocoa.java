package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="capacitaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class capacitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_capacitacion", unique = true)
    private long id;

    @Column(name = "hora_cap", nullable = false)
    private LocalTime hora;

    @Column(name = "fecha_cap", nullable = false)
    private Date fecha;

    @Column(name = "tipo_capacitacion", nullable = false, length = 100)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "id_documento")
    private documento documentos;

    @ManyToMany
    @JoinTable(name = "capacitaciones_campesinos",
            joinColumns = @JoinColumn(name = "id_capacitacion"),
            inverseJoinColumns = @JoinColumn(name = "id_campesino"))
    private List<campesino> campesinos;
}
