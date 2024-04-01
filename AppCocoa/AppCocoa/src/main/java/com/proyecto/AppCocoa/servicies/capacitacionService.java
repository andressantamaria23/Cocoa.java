package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.capacitacion;

import java.util.List;

public interface capacitacionService {

     List<capacitacion> findAll() throws Exception;
         capacitacion findById(Long id);
    public void create(capacitacion capacitacion);

    public void update(capacitacion capacitacion);

    public void delete(capacitacion capacitacion);
}
