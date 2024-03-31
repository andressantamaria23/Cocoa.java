package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.salida;

import java.util.List;

public interface salidaService {

    List<salida> findAll() throws Exception;

     salida findById(Long id);
    public void create(salida salida);

    public void update(salida salida);

    public void delete(salida salida);
}
