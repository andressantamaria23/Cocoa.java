package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.cargo;

import java.util.List;

public interface cargoService {

      List<cargo> findAll() throws Exception;

   cargo findById(Long id);
    public void create(cargo cargo);

    public void update(cargo cargo);

    public void delete(cargo cargo);
}
