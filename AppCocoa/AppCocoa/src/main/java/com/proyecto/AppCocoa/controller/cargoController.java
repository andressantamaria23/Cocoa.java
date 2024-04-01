package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.capacitacion;
import com.proyecto.AppCocoa.entities.cargo;
import com.proyecto.AppCocoa.servicies.imp.cargoimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/capacitacion/",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD})
@CrossOrigin("*")
public class cargoController{

    @Autowired
    private cargoimp cargoimp;
    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
            cargo cargo = new cargo();

            // cargo.setId(Long.parseLong( request.get("id").toString()));

            this.cargoimp.create(cargo);
            cargo.setTipo_cargo(request.get("tipo_cargo").toString());
            cargo.setDescripcion(request.get("descipcion").toString());
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

            List<cargo> cargoList = this.cargoimp.findAll();
            response.put("status", "succes");
            response.put("data", cargoList);


        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
