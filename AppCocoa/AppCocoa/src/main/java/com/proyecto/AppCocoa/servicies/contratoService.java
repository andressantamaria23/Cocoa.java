package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.contrato;

import java.util.List;

public interface contratoService {

     List<contrato> findAll() throws Exception;

    contrato findById(Long id);
    public void create(contrato contrato);

    public void update(contrato contrato);

    public void delete(contrato contrato);
}
