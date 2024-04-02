package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.entrada;
import com.proyecto.AppCocoa.servicies.imp.entradaimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/entrada/",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD})
@CrossOrigin("*")
public class entradaController {

    @Autowired
    private entradaimp entradaimp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
            entrada entrada = new entrada();

            //entrada.setId(Long.parseLong( request.get("id").toString()));
            entrada.setStartdate(Date.valueOf(request.get("fechainicio").toString()));
            entrada.setCant(Long.parseLong(request.get("cantidad").toString()));
            this.entradaimp.create(entrada);


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

            List<entrada> inventarioList = this.entradaimp.findAll();
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
