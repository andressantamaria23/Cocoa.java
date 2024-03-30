package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contratoRepository extends JpaRepository<contrato,Long> {
}
