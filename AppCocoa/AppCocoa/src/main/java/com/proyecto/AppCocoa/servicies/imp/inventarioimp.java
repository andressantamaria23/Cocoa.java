package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.inventario;
import com.proyecto.AppCocoa.repositories.inventarioRepository;
import com.proyecto.AppCocoa.servicies.inventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class inventarioimp implements inventarioService {
    @Autowired
    private inventarioRepository inventarioRepository;
    @Override
    public List<inventario> findAll() throws Exception {
        return this.inventarioRepository.findAll();
    }

    @Override
    public inventario findById(Long id) {
        return this.inventarioRepository.getById(id);
    }

    @Override
    public void create(inventario inventario) {
        this.inventarioRepository.save(inventario);
    }

    @Override
    public void update(inventario inventario) {
        this.inventarioRepository.save(inventario);
    }

    @Override
    public void delete(inventario inventario) {
        this.inventarioRepository.delete(inventario);
    }
}
