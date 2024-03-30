package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface entradaRepository extends JpaRepository<entrada,Long> {
}
