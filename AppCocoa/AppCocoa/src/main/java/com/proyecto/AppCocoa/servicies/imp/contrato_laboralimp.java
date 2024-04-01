package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.contrato_laboral;
import com.proyecto.AppCocoa.servicies.contrato_laboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.AppCocoa.repositories.contrato_laboralRepository;

import java.util.List;
@Service
public class contrato_laboralimp implements contrato_laboralService {

    @Autowired
    private contrato_laboralRepository contrato_laboralRepository;
    @Override
    public List<contrato_laboral> findAll() throws Exception {
        return this.contrato_laboralRepository.findAll();
    }

    @Override
    public com.proyecto.AppCocoa.entities.contrato_laboral findById(Long id) {
        return this.contrato_laboralRepository.getById(id);
    }

    @Override
    public void create(com.proyecto.AppCocoa.entities.contrato_laboral contrato_Laboral) {
    this.contrato_laboralRepository.save(contrato_Laboral);
    }

    @Override
    public void update(com.proyecto.AppCocoa.entities.contrato_laboral contrato_laboral) {
    this.contrato_laboralRepository.save(contrato_laboral);
    }

    @Override
    public void delete(com.proyecto.AppCocoa.entities.contrato_laboral contrato_laboral) {
    this.contrato_laboralRepository.delete(contrato_laboral);
    }
}
