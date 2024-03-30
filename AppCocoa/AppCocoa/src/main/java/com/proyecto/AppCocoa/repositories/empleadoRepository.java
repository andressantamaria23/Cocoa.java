package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empleadoRepository extends JpaRepository<empleado,Long> {
}
