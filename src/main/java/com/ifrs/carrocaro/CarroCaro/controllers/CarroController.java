package com.ifrs.carrocaro.CarroCaro.controllers;

import com.ifrs.carrocaro.CarroCaro.models.Carro;

//import com.ifrs.carrocarro.services.CarroService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import javax.validation.Valid;
import com.ifrs.carrocaro.CarroCaro.repositories.*;

@Controller
public class CarroController {
  private Carro Carro;

  @CrossOrigin
  @GetMapping("/Carro")
  public ResponseEntity<String> get()
  {
    return ResponseEntity.ok("[{'carId':1,'nome':'Vectra','datacompra':'2019-10-02','placa':'itk-2098','preco':1000.0,'formacompra':'dinheiro','datafabricacao':'2018-10-10','foto':'','descricao':'carro bonito'},{'carId':2,'nome':'Vectra','datacompra':'2019-10-02','placa':'itk-2098','preco':1000.0,'formacompra':'dinheiro','datafabricacao':'2018-10-10','foto':'','descricao':'carro bonito'},{'carId':3,'nome':'Carro teste','datacompra':'2019-10-02','placa':'itk-2098','preco':3000.0,'formacompra':'dinheiro','datafabricacao':'2018-10-10','foto':'','descricao':'carro bonito'}]");
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