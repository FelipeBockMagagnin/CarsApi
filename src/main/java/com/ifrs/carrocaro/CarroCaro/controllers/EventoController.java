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
  public ResponseEntity<Evento> post(@Valid @RequestBody Evento evento)
  {
    return ResponseEntity.ok(er.save(evento));  
  }

  // @RequestMapping(path = "/evento", method = RequestMethod.GET)
  // public List<Evento> getByData(@RequestParam String dataInicial, @RequestParam String DataFinal) {
  //     //return er.findAllbyTempo(dataInicial, DataFinal);
  // }

  @CrossOrigin
  @PutMapping("/Evento/{id}")
  public ResponseEntity<Evento> updateEvento(@Valid @RequestBody Evento Evento,
    @PathVariable(value= "id") Long id) {
        return ResponseEntity.ok(er.save(Evento));
    }
}