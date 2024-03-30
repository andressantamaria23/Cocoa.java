package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.contrato_comercial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contrato_comercialRepository extends JpaRepository<contrato_comercial,Long> {
}
