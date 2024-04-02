package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.orden_compra;
import com.proyecto.AppCocoa.servicies.imp.orden_compraimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/inventario/",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD})
@CrossOrigin("*")
public class orden_compraController {

    @Autowired
    private orden_compraimp orden_compraimp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
            orden_compra orden_compra = new orden_compra();

            //orden_compra.setId(Long.parseLong( request.get("id").toString()));
            orden_compra.setDate(Date.valueOf(request.get("fecha_compra").toString()));
            orden_compra.setCantidad(Long.parseLong(request.get("cantidad_producto").toString()));
            orden_compra.setValue(Long.parseLong(request.get("valor_compra").toString()));

            this.orden_compraimp.create(orden_compra);


            response.put("status", "succes");
            response.put("data", "Registro extiso");


        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("all")

    public ResponseEntity<Map<String, Object>> findAll() {
        Map<String, Object> response = new HashMap<>();

        try {

            List<orden_compra> orden_compraList = this.orden_compraimp.findAll();
            response.put("status", "succes");
            response.put("data",orden_compraList );


        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
