package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.campesino;

import java.util.List;

public interface campesinoService {

    List<campesino> findAll() throws Exception;

    campesino findById(Long id);
    public void create(campesino campesino);

    public void update(campesino campesino);

    public void delete(campesino campesino);
}
