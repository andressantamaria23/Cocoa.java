package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.contrato_laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contrato_laboralRepository extends JpaRepository<contrato_laboral,Long> {
}
