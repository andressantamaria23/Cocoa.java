package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.empleado;
import com.proyecto.AppCocoa.repositories.empleadoRepository;
import com.proyecto.AppCocoa.servicies.empleadoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class empleadoimp implements empleadoService {
    @Autowired
    private empleadoRepository empleadoRepository;
    @Override
    public List<empleado> findAll() throws Exception {
        return this.empleadoRepository.findAll();
    }

    @Override
    public empleado findById(Long id) {
        return this.empleadoRepository.getById(id);
    }

    @Override
    public void create(empleado empleado) {
    this.empleadoRepository.save(empleado);
    }

    @Override
    public void update(empleado empleado) {
    this.empleadoRepository.save(empleado);
    }

    @Override
    public void delete(empleado empleado) {
    this.empleadoRepository.delete(empleado);
    }
}
