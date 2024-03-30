package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface capacitacionRepository extends JpaRepository<capacitacion,Long> {
}
