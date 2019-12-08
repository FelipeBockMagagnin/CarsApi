package com.ifrs.carrocaro.CarroCaro.controllers;

import javax.validation.Valid;

import com.ifrs.carrocaro.CarroCaro.models.Evento;
import com.ifrs.carrocaro.CarroCaro.repositories.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EventoController {

  @Autowired
	private EventoRepository er;

  @CrossOrigin
  @GetMapping("/evento")
  public ResponseEntity<List<Evento>> getAll()
  {
    return ResponseEntity.ok(er.findAll()); 
  }

  @CrossOrigin
  @PostMapping("/evento")
  public Evento post(@Valid @RequestBody Evento evento)
  {
    return er.save(evento);  
  }

  // @CrossOrigin
  // @GetMapping('/Evento')
  // public List<Evento> all() {
  //    return Evento.getAllEventos();
  // }

  // @CrossOrigin
  // @PostMapping('/Evento')
  // public ResponseEntity<Evento> createEvento (@Valid @RequestBody Evento Evento) {
  //     return ResponseEntity.ok(Evento.saveEvento(Evento));
  // }

  // @CrossOrigin
  // @PutMapping('/Evento/{id}')
  // public ResponseEntity<Evento> updateEvento(@Valid @RequestBody Evento Evento,
  //   @PathVariable(value= 'id') Long id) {
  //       return ResponseEntity.ok(Evento.updateEvento(Evento, id));
  //   }

  // @CrossOrigin
  // @DeleteMapping('/Evento/{id}')
  // public ResponseEntity<?> deleteMemeber(@PathVariable Long id) {
  //   Map<String,String> response = new HashMap<String,String>();
  //   if(Evento.deleteEvento(id)) {
  //     response.put('status', 'success');
  //     response.put('message', 'Evento deleted successfully');
  //      return ResponseEntity.ok(response);
  //   } else {
  //     response.put('status', 'error');
  //     response.put('message', 'Somthing went wrong when delete the Evento');
  //     return ResponseEntity.status(500).body(response);
  //   }
  // }
}