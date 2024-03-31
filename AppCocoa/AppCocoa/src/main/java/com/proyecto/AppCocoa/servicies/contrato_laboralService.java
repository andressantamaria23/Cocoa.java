package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.contrato_laboral;

import java.util.List;

public interface contrato_laboralService {

     List<contrato_laboral> findAll() throws Exception;

    contrato_laboral findById(Long id);
    public void create(contrato_laboral contrato_Laboral);

    public void update(contrato_laboral contrato_laboral);

    public void delete(contrato_laboral contrato_laboral);
}
