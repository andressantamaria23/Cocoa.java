package com.proyecto.AppCocoa.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="documentos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class documento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id_documento",unique = true)
    private long id;

    @Column(name = "tipo_documento",length = 60,nullable = false)
    private String type;
    @Column(name="version")
    private long version;
    @Column(name="archivo",length = 300,nullable = false)
    private String text;

}
