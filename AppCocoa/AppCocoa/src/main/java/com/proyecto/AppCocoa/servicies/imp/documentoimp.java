package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.documento;
import com.proyecto.AppCocoa.servicies.documentoService;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.AppCocoa.repositories.documentoRepository;

import java.util.List;

public class documentoimp implements documentoService {
    @Autowired
    private documentoRepository documentoRepository;
    @Override
    public List<documento> findAll() throws Exception {
        return this.documentoRepository.findAll();
    }

    @Override
    public documento findById(Long id) {
        return this.documentoRepository.getById(id);
    }

    @Override
    public void create(documento documento) {
        this.documentoRepository.save(documento);
    }

    @Override
    public void update(documento documento) {
        this.documentoRepository.save(documento);
    }

    @Override
    public void delete(documento documento) {
        this.documentoRepository.delete(documento);
    }
}
