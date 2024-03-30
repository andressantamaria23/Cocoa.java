package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.salida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface salidaRepository extends JpaRepository<salida,Long> {
}
