package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.documento;

import java.util.List;

public interface documentoService {

     List<documento> findAll() throws Exception;

    documento findById(Long id);
    public void create(documento documento);

    public void update(documento documento);

    public void delete(documento documento);
}
