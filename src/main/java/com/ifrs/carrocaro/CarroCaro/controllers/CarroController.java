package com.ifrs.carrocaro.CarroCaro.controllers;

import com.ifrs.carrocaro.CarroCaro.models.Carro;

import org.springframework.beans.factory.annotation.Autowired;
//import com.ifrs.carrocarro.services.CarroService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import javax.validation.Valid;
import com.ifrs.carrocaro.CarroCaro.repositories.*;

@Controller
public class CarroController {

    @Autowired
    private CarroRepository cr;

    @Autowired
    private EventoRepository er;

    @CrossOrigin
    @GetMapping("/carro")
    public ResponseEntity<List<Carro>> getAll() {
        return ResponseEntity.ok(cr.findAll());
    }

    @CrossOrigin
    @PostMapping("/carro")
    public ResponseEntity<Carro> post(@Valid @RequestBody Carro evento) {
        return ResponseEntity.ok(cr.save(evento));
    }

    // @CrossOrigin
    // @PutMapping("/Carro/{id}")
    // public ResponseEntity<Carro> updateCarro(@Valid @RequestBody Carro Carro,
    // @PathVariable(value = "id") Long id) {
    // return ResponseEntity.ok(cr.save(Carro));
    // }

    @CrossOrigin
    @DeleteMapping("/carro/{id}")
    public ResponseEntity<Map<String, String>> deleteCarro(@PathVariable Long id) {
        Map<String, String> response = new HashMap<String, String>();
        try {
            cr.deleteById(id);
            response.put("status", "success");
            response.put("message", "Carro deleted successfully");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Something went wrong when delete the Carro");
            return ResponseEntity.status(500).body(response);
        }
    }
}