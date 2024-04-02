package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.documento;
import com.proyecto.AppCocoa.servicies.imp.documentoimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/documento/",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD})
@CrossOrigin("*")
public class documentoController {

    @Autowired
    private documentoimp documentoimp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
            documento documento = new documento();

            //documento.setId(Long.parseLong( request.get("id").toString()));
            documento.setText(request.get("archivo").toString());
            documento.setType(request.get("tipo").toString());
            documento.setVersion(Long.parseLong(request.get("version").toString()));
            this.documentoimp.create(documento);


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

            List<documento> documentoList = this.documentoimp.findAll();
            response.put("status", "succes");
            response.put("data",documentoList );


        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
