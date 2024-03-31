package com.proyecto.AppCocoa.servicies;

import com.proyecto.AppCocoa.entities.orden_compra;

import java.util.List;

public interface orden_compraService {

     List<orden_compra> findAll() throws Exception;

     orden_compra findById(Long id);
    public void create(orden_compra orden_compra);

    public void update(orden_compra orden_compra);

    public void delete(orden_compra orden_compra);
}
