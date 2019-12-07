package com.ifrs.carrocaro.CarroCaro.controllers;

import com.ifrs.carrocaro.CarroCaro.models.Evento;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import javax.validation.Valid;

@Controller
public class EventoController {
  private Evento Evento;

  @CrossOrigin
  @GetMapping("/Evento")
  public List<Evento> all() {
     return Evento.getAllEventos();
  }

  @CrossOrigin
  @PostMapping("/Evento")
  public ResponseEntity<Evento> createEvento (@Valid @RequestBody Evento Evento) {
      return ResponseEntity.ok(Evento.saveEvento(Evento));
  }

  @CrossOrigin
  @PutMapping("/Evento/{id}")
  public ResponseEntity<Evento> updateEvento(@Valid @RequestBody Evento Evento,
    @PathVariable(value= "id") Long id) {
        return ResponseEntity.ok(Evento.updateEvento(Evento, id));
    }

  @CrossOrigin
  @DeleteMapping("/Evento/{id}")
  public ResponseEntity<?> deleteMemeber(@PathVariable Long id) {
    Map<String,String> response = new HashMap<String,String>();
    if(Evento.deleteEvento(id)) {
      response.put("status", "success");
      response.put("message", "Evento deleted successfully");
       return ResponseEntity.ok(response);
    } else {
      response.put("status", "error");
      response.put("message", "Somthing went wrong when delete the Evento");
      return ResponseEntity.status(500).body(response);
    }
  }
}