package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.orden_compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orden_compraRepository extends JpaRepository<orden_compra,Long> {
}
