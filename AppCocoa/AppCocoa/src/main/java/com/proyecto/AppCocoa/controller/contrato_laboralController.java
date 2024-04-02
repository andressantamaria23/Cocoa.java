package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.contrato_laboral;
import com.proyecto.AppCocoa.servicies.imp.contrato_laboralimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/contrato_laboral/",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD})
@CrossOrigin("*")
public class contrato_laboralController {

    @Autowired
    private contrato_laboralimp contrato_laboralimp;
    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
            contrato_laboral contrato_laboral = new contrato_laboral();

            //contrato_laboral.setId(Long.parseLong( request.get("id").toString()));
            contrato_laboral.setFunciones(request.get("funciones").toString());
            contrato_laboral.setSalario(Long.parseLong(request.get("salario").toString()));
            this.contrato_laboralimp.create(contrato_laboral);


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

            List<contrato_laboral> contratoLaboralList = this.contrato_laboralimp.findAll();
            response.put("status", "succes");
            response.put("data",contratoLaboralList );


        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
