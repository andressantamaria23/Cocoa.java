package com.proyecto.AppCocoa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name="empleados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id_empleado", unique = true)
    private long id;

    @Column(name="NomEmpleado",length = 50,nullable = false)
    private String name;

    @Column(name = "ApellEmpleado",length = 50,nullable = false)
    private String lastname;

    @Column(name="Localidad",length = 50,nullable = false)
    private String Localidad;

    @Column(name="Barrio",length = 50)
    private String barrio;
    @Column(name="fecha_nacimiento")
    private Date date;

    @Column(name="direccion",length = 90,nullable = false)
    private String direccion;

    @Lob
    @Column(name="foto",nullable = false)
    private byte[] foto;

    @Column(name="usuario",nullable = false,unique = true,length = 30)
    private String user;
    @Column(name="contraseña",nullable = false,length = 15)
    private  String password;

    @ManyToOne
    @JoinColumn(name="id_Cargo")
    private cargo cargos;
    @ManyToOne
    @JoinColumn(name="fkid_contrato")
    private contrato_laboral contratoLaboral;
}
