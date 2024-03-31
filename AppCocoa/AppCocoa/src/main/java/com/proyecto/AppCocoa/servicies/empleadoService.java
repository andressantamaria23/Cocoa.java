package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.empleado;

import java.util.List;

public interface empleadoService {

     List<empleado> findAll() throws Exception;

     empleado findById(Long id);
    public void create(empleado empleado);

    public void update(empleado empleado);

    public void delete(empleado empleado);
}
