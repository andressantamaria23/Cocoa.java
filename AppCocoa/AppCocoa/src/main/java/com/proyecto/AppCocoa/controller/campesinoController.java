package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.campesino;
import com.proyecto.AppCocoa.servicies.imp.campesinoimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(path = "/api/campesino/",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD})
@CrossOrigin("*")
public class campesinoController {

    @Autowired
    private campesinoimp campesinoimp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
            campesino campesino = new campesino();

            //campesino.setId(Long.parseLong( request.get("id").toString()));
            campesino.setDireccion(request.get("direccion").toString());
            campesino.setName(request.get("name").toString());
            campesino.setTel(Long.parseLong(request.get("tel").toString()));
            this.campesinoimp.create(campesino);


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

            List<campesino> campesinoList = this.campesinoimp.findAll();
            response.put("status", "succes");
            response.put("data", campesinoList);


        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}