package com.ifrs.carrocaro.CarroCaro.controllers;

import com.ifrs.carrocaro.CarroCaro.models.Carro;

//import com.ifrs.carrocarro.services.CarroService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import javax.validation.Valid;

@Controller
public class CarroController {
  private Carro Carro;

  @CrossOrigin
  @GetMapping("/Carro")
  public List<Carro> all() {
     return Carro.getAllCarros();
  }

  @CrossOrigin
  @PostMapping("/Carro")
  public ResponseEntity<Carro> createCarro (@Valid @RequestBody Carro Carro) {
      return ResponseEntity.ok(Carro.saveCarro(Carro));
  }

  @CrossOrigin
  @PutMapping("/Carro/{id}")
  public ResponseEntity<Carro> updateCarro(@Valid @RequestBody Carro Carro,
    @PathVariable(value= "id") Long id) {
        return ResponseEntity.ok(Carro.updateCarro(Carro, id));
    }

  @CrossOrigin
  @DeleteMapping("/Carro/{id}")
  public ResponseEntity<?> deleteMemeber(@PathVariable Long id) {
    Map<String,String> response = new HashMap<String,String>();
    if(Carro.deleteCarro(id)) {
      response.put("status", "success");
      response.put("message", "Carro deleted successfully");
       return ResponseEntity.ok(response);
    } else {
      response.put("status", "error");
      response.put("message", "Somthing went wrong when delete the Carro");
      return ResponseEntity.status(500).body(response);
    }
  }
}