package com.proyecto.AppCocoa.repositories;

import com.proyecto.AppCocoa.entities.cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cargoRepository extends JpaRepository<cargo,Long> {
}
