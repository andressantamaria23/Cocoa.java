package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.cargo;
import com.proyecto.AppCocoa.servicies.cargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.AppCocoa.repositories.cargoRepository;

import java.util.List;
@Service
public class cargoimp implements cargoService {

    @Autowired
    private cargoRepository cargoRepository;
    @Override
    public List<cargo> findAll() throws Exception {
        return this.cargoRepository.findAll();
    }

    @Override
    public cargo findById(Long id) {
        return this.cargoRepository.getById(id);
    }

    @Override
    public void create(cargo cargo) {
    this.cargoRepository.save(cargo);
    }

    @Override
    public void update(cargo cargo) {
    this.cargoRepository.save(cargo);
    }

    @Override
    public void delete(cargo cargo) {
    this.cargoRepository.delete(cargo);
    }
}
