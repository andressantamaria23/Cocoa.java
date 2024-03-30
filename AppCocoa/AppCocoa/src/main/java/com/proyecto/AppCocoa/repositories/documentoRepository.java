package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface documentoRepository extends JpaRepository<documento,Long> {
}
