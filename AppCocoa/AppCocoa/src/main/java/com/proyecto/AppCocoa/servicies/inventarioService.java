package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.inventario;

import java.util.List;

public interface inventarioService {

     List<inventario> findAll() throws Exception;

     inventario findById(Long id);
    public void create(inventario inventario);

    public void update(inventario inventario);

    public void delete(inventario inventario);
}
