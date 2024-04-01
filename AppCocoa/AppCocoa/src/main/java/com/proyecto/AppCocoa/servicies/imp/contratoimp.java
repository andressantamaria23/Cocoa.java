package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.contrato;
import com.proyecto.AppCocoa.servicies.contratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.AppCocoa.repositories.contratoRepository;
import java.util.List;
@Service
public class contratoimp implements contratoService {

    @Autowired
    private contratoRepository contratoRepository;
    @Override
    public List<contrato> findAll() throws Exception {
        return this.contratoRepository.findAll();
    }

    @Override
    public contrato findById(Long id) {
        return this.contratoRepository.getById(id);
    }

    @Override
    public void create(contrato contrato) {
    this.contratoRepository.save(contrato);
    }

    @Override
    public void update(contrato contrato) {
this.contratoRepository.save(contrato);
    }

    @Override
    public void delete(contrato contrato) {
this.contratoRepository.save(contrato);
    }
}
