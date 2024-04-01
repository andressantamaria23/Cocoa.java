package com.proyecto.AppCocoa.servicies.imp;

import com.proyecto.AppCocoa.entities.orden_compra;
import com.proyecto.AppCocoa.repositories.orden_compraRepository;
import com.proyecto.AppCocoa.servicies.orden_compraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class orden_compraimp implements orden_compraService {
    @Autowired
    private orden_compraRepository orden_compraRepository;
    @Override
    public List<orden_compra> findAll() throws Exception {
        return this.orden_compraRepository.findAll();
    }

    @Override
    public orden_compra findById(Long id) {
        return this.orden_compraRepository.getById(id);
    }

    @Override
    public void create(orden_compra orden_compra) {
        this.orden_compraRepository.save(orden_compra);
    }

    @Override
    public void update(orden_compra orden_compra) {
    this.orden_compraRepository.save(orden_compra);
    }

    @Override
    public void delete(orden_compra orden_compra) {
        this.orden_compraRepository.delete(orden_compra);
    }
}
