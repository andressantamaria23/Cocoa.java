package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.capacitacion;

import java.util.List;

public interface capacitacionService {

    public List<capacitacion> findAll() throws Exception;
    public capacitacion findById(int id);
    public void create(capacitacion capacitacion);

    public void update(capacitacion capacitacion);

    public void delete(capacitacion capacitacion);
}
