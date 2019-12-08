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
  
  @CrossOrigin
  @GetMapping("/carro")
  public ResponseEntity<List<Carro>> getAll()
  {
    return ResponseEntity.ok(cr.findAll()); 
  }

  @CrossOrigin
  @PostMapping("/carro")
  public Carro post(@Valid @RequestBody Carro evento)
  {
    return cr.save(evento);  
  }

  // @CrossOrigin
  // @GetMapping("/Carro/Data")
  // public List<Carro> GetByData() {
  //    return Carro.getAllCarros();
  // }

  // @CrossOrigin
  // @PostMapping('/Carro')
  // public ResponseEntity<Carro> createCarro (@Valid @RequestBody Carro Carro) {
  //     return ResponseEntity.ok(Carro.saveCarro(Carro));
  // }

  // @CrossOrigin
  // @PutMapping('/Carro/{id}')
  // public ResponseEntity<Carro> updateCarro(@Valid @RequestBody Carro Carro,
  //   @PathVariable(value= 'id') Long id) {
  //       return ResponseEntity.ok(Carro.updateCarro(Carro, id));
  //   }

  // @CrossOrigin
  // @DeleteMapping('/Carro/{id}')
  // public ResponseEntity<?> deleteMemeber(@PathVariable Long id) {
  //   Map<String,String> response = new HashMap<String,String>();
  //   if(Carro.deleteCarro(id)) {
  //     response.put('status', 'success');
  //     response.put('message', 'Carro deleted successfully');
  //      return ResponseEntity.ok(response);
  //   } else {
  //     response.put('status', 'error');
  //     response.put('message', 'Somthing went wrong when delete the Carro');
  //     return ResponseEntity.status(500).body(response);
  //   }
  // }
}