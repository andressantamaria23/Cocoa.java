package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.campesino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface campesinoRepository extends JpaRepository <campesino,Long> {
}
