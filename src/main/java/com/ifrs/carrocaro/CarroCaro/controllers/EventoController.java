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
  public ResponseEntity<String> get()
  {
    return ResponseEntity.ok("Quantidade de entidades" + er.count());
    // Iterable<Evento> eventos = er.findAll();
    // return ResponseEntity.ok(eventos.toString());    
    //return ResponseEntity.ok("[{'eventId':1,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':2,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':3,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':5,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':6,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':7,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':8,'titulo':'tag','data':'data','tag':'evento legal','valor':1300.0,'descricao':'titulo','id_carro':100},{'eventId':9,'titulo':'titulo teste','data':'12-03-2019','tag':'evento legal','valor':200.0,'descricao':'titulo','id_carro':1},{'eventId':10,'titulo':'titulo teste','data':'12-03-2019','tag':'evento legal','valor':200.0,'descricao':'titulo','id_carro':1},{'eventId':11,'titulo':'titulo teste','data':'12-03-2019','tag':'evento legal','valor':200.0,'descricao':'titulo','id_carro':1},{'eventId':12,'titulo':'titulo teste','data':'12-03-2019','tag':'evento legal','valor':20032.0,'descricao':'titulo','id_carro':1}]");
  }

  @CrossOrigin
  @GetMapping("/eventos")
  public ResponseEntity<List<Evento>> getAll()
  {
    return ResponseEntity.ok(er.findAll());
    // Iterable<Evento> eventos = er.findAll();
    // return ResponseEntity.ok(eventos.toString());    
    //return ResponseEntity.ok("[{'eventId':1,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':2,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':3,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':5,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':6,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':7,'titulo':'tag','data':'data','tag':'evento legal','valor':1.0,'descricao':'titulo','id_carro':100},{'eventId':8,'titulo':'tag','data':'data','tag':'evento legal','valor':1300.0,'descricao':'titulo','id_carro':100},{'eventId':9,'titulo':'titulo teste','data':'12-03-2019','tag':'evento legal','valor':200.0,'descricao':'titulo','id_carro':1},{'eventId':10,'titulo':'titulo teste','data':'12-03-2019','tag':'evento legal','valor':200.0,'descricao':'titulo','id_carro':1},{'eventId':11,'titulo':'titulo teste','data':'12-03-2019','tag':'evento legal','valor':200.0,'descricao':'titulo','id_carro':1},{'eventId':12,'titulo':'titulo teste','data':'12-03-2019','tag':'evento legal','valor':20032.0,'descricao':'titulo','id_carro':1}]");
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