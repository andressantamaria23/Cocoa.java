package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.entrada;

import java.util.List;

public interface entradaService {

     List<entrada> findAll() throws Exception;

     entrada findById(Long id);
    public void create(entrada entrada);

    public void update(entrada entrada);

    public void delete(entrada entrada);
}
