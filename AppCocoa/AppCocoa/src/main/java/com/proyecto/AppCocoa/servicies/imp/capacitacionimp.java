package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.capacitacion;
import com.proyecto.AppCocoa.servicies.capacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.AppCocoa.repositories.capacitacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class capacitacionimp implements capacitacionService {

    @Autowired
    private capacitacionRepository capacitacionRepository;
    @Override
    public List<capacitacion> findAll() throws Exception {
        return this.capacitacionRepository.findAll();
    }

    @Override
    public capacitacion findById(Long id) {
        return this.capacitacionRepository.getById(id);
    }

    @Override
    public void create(capacitacion capacitacion) {
        this.capacitacionRepository.save(capacitacion);
    }

    @Override
    public void update(capacitacion capacitacion) {
        this.capacitacionRepository.save(capacitacion);
    }

    @Override
    public void delete(capacitacion capacitacion) {
        this.capacitacionRepository.delete(capacitacion);
    }
}
