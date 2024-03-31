package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.campesino;
import com.proyecto.AppCocoa.repositories.campesinoRepository;
import com.proyecto.AppCocoa.servicies.campesinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class campesinoimp implements campesinoService {


    @Autowired
    private campesinoRepository campesinoRepository;
    @Override
    public List<campesino> findAll() throws Exception {
        return this.campesinoRepository.findAll();
    }

    @Override
    public campesino findById(Long id) {
    return this.campesinoRepository.getById(id);
    }

    @Override
    public void create(campesino campesino) {
        this.campesinoRepository.save(campesino);
    }

    @Override
    public void update(campesino campesino) {
        this.campesinoRepository.save(campesino);
    }

    @Override
    public void delete(campesino campesino) {
        this.campesinoRepository.delete(campesino);
    }
}
