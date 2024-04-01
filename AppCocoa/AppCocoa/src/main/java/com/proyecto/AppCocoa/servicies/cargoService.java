package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.cargo;

import java.util.List;

public interface cargoService {

     public List<cargo> findAll() throws Exception;

   public cargo findById(Long id);
    public void create(cargo cargo);

    public void update(cargo cargo);

    public void delete(cargo cargo);
}
