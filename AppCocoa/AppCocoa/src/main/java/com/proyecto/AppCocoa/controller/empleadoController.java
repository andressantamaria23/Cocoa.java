package com.proyecto.AppCocoa.controller;

import com.proyecto.AppCocoa.entities.empleado;
import com.proyecto.AppCocoa.servicies.imp.empleadoimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/empleado/",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD})
@CrossOrigin("*")
public class empleadoController {

    @Autowired
    private empleadoimp empleadoimp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            System.out.print("@@@@@@@" + request);
             empleado empleado = new empleado();

            //empleado.setId(Long.parseLong( request.get("id").toString()));
            empleado.setName(request.get("nombre").toString());
            empleado.setLastname(request.get("apellido").toString());
            empleado.setBarrio(request.get("barrio").toString());
            empleado.setLocalidad(request.get("localidad").toString());
            empleado.setDireccion(request.get("direccion").toString());
            empleado.setDate(Date.valueOf("date"));
            empleado.setFoto(request.get("foto").toString().getBytes());
            empleado.setUser(request.get("user").toString());
            empleado.setPassword(request.get("contraseña").toString());
            this.empleadoimp.create(empleado);


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

            List<empleado> empleadoList = this.empleadoimp.findAll();
            response.put("status", "succes");
            response.put("data",empleadoList);

        } catch (Exception e) {
            response.put("status", HttpStatus.BAD_GATEWAY);
            response.put("data", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
