package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.entrada;
import com.proyecto.AppCocoa.repositories.entradaRepository;
import com.proyecto.AppCocoa.servicies.entradaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class entradaimp implements entradaService {

    @Autowired
    private entradaRepository entradaRepository;
    @Override
    public List<entrada> findAll() throws Exception {
        return this.entradaRepository.findAll();
    }

    @Override
    public entrada findById(Long id) {
        return this.entradaRepository.getById(id);
    }

    @Override
    public void create(entrada entrada) {
        this.entradaRepository.save(entrada);
    }

    @Override
    public void update(entrada entrada) {
        this.entradaRepository.save(entrada);
    }

    @Override
    public void delete(entrada entrada) {
        this.entradaRepository.delete(entrada);
    }
}
