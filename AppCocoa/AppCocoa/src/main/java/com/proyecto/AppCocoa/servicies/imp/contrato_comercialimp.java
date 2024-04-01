package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.contrato_comercial;
import com.proyecto.AppCocoa.servicies.contrato_comercialService;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.AppCocoa.repositories.contrato_comercialRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class contrato_comercialimp implements contrato_comercialService {
    @Autowired
    private contrato_comercialRepository contrato_comercialRepository;
    @Override
    public List<contrato_comercial> findAll() throws Exception {
        return this.contrato_comercialRepository.findAll();
    }

    @Override
    public contrato_comercial findById(Long id) {
        return this.contrato_comercialRepository.getById(id);
    }

    @Override
    public void create(contrato_comercial contrato_comercial) {
        this.contrato_comercialRepository.save(contrato_comercial);
    }

    @Override
    public void update(contrato_comercial contrato_comercial) {
        this.contrato_comercialRepository.save(contrato_comercial);

    }

    @Override
    public void delete(contrato_comercial contrato_comercial) {
        this.contrato_comercialRepository.delete(contrato_comercial);
    }
}
