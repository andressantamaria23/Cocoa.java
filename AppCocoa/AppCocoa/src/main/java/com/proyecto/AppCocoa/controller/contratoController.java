package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.campesino;
import com.proyecto.AppCocoa.entities.contrato;
import com.proyecto.AppCocoa.servicies.imp.contratoimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/contrato/",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD})
@CrossOrigin("*")
public class contratoController {

@Autowired
    private contratoimp contratoimp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
            contrato contrato = new contrato();

            //contrato.setId(Long.parseLong( request.get("id").toString()));
            contrato.setStartdate(Date.valueOf(request.get("fechaincio").toString()));
            contrato.setEndate(Date.valueOf(request.get("fechafin").toString()));
            this.contratoimp.create(contrato);

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

            List<contrato> contratoList = this.contratoimp.findAll();
            response.put("status", "succes");
            response.put("data", contratoimp);


        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    }

