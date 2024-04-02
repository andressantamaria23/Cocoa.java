package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.contrato;
import com.proyecto.AppCocoa.entities.contrato_comercial;
import com.proyecto.AppCocoa.servicies.imp.contrato_comercialimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/contrato_Comercial/",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD})
@CrossOrigin("*")
public class contrato_ComercialController {

    @Autowired
    private contrato_comercialimp contrato_comercialimp;
    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
            contrato_comercial contrato_comercial = new contrato_comercial();

            //contrato_comercial.setId(Long.parseLong( request.get("id").toString()));
            contrato_comercial.setMonto(Long.parseLong(request.get("monto").toString()));
            contrato_comercial.setAcuerdos(request.get("acuerdos").toString());
            this.contrato_comercialimp.create(contrato_comercial);


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

            List<contrato_comercial> contrato_comercialList = this.contrato_comercialimp.findAll();
            response.put("status", "succes");
            response.put("data", contrato_comercialList);


        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
