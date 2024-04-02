package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.inventario;
import com.proyecto.AppCocoa.servicies.imp.inventarioimp;
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
public class inventarioController {

    @Autowired
    private inventarioimp inventarioimp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
            inventario inventario = new inventario();

            //inventario.setId(Long.parseLong( request.get("id").toString()));
            inventario.setCant(Long.parseLong(request.get("cantidad").toString()));
            inventario.setDatef(Date.valueOf(request.get("date").toString()));
            inventario.setProducto(request.get("producto").toString());

            this.inventarioimp.create(inventario);


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

            List<inventario> inventarioList = this.inventarioimp.findAll();
            response.put("status", "succes");
            response.put("data",inventarioList );


        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
