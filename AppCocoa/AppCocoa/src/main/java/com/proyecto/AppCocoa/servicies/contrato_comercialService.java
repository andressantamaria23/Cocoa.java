package com.proyecto.AppCocoa.servicies;


import com.proyecto.AppCocoa.entities.contrato_comercial;

import java.util.List;

public interface contrato_comercialService {

     List<contrato_comercial> findAll() throws Exception;

     contrato_comercial findById(Long id);
    public void create(contrato_comercial contrato_comercial);

    public void update(contrato_comercial contrato_comercial);

    public void delete(contrato_comercial contrato_comercial);
}
