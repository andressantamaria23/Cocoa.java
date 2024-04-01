package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.salida;
import com.proyecto.AppCocoa.repositories.salidaRepository;
import com.proyecto.AppCocoa.servicies.salidaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class salidaimp implements salidaService {
    @Autowired
    private salidaRepository salidaRepository;
    @Override
    public List<salida> findAll() throws Exception {
        return this.salidaRepository.findAll();
    }

    @Override
    public salida findById(Long id) {
        return this.salidaRepository.getById(id);
    }

    @Override
    public void create(salida salida) {
        this.salidaRepository.save(salida);
    }

    @Override
    public void update(salida salida) {
        this.salidaRepository.save(salida);
    }

    @Override
    public void delete(salida salida) {
        this.salidaRepository.delete(salida);
    }
}
