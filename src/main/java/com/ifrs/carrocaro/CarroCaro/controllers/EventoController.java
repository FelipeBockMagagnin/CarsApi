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
    public ResponseEntity<List<Evento>> getAll() {
        return ResponseEntity.ok(er.findAll());
    }

    @CrossOrigin
    @PostMapping("/evento")
    public ResponseEntity<Evento> post(@Valid @RequestBody Evento evento) {
        if (er.existsById(evento.getId())) {
            er.deleteById(evento.getId());
            return ResponseEntity.ok(er.save(evento));
        } else {
            return ResponseEntity.ok(er.save(evento));
        }
    }

    // @CrossOrigin
    // @PostMapping("/evento/{carro_id}")
    // public ResponseEntity<List<Evento>> post(@PathVariable(value = "carro_id") Long carro_id) {
    //     return ResponseEntity.ok(er.findAllByid_carro(carro_id));        
    // }

    // @RequestMapping(path = "/evento", method = RequestMethod.GET)
    // public List<Evento> getByData(@RequestParam String dataInicial, @RequestParam
    // String DataFinal) {
    // //return er.findAllbyTempo(dataInicial, DataFinal);
    // }

    @CrossOrigin
    @PutMapping("/Evento/{id}")
    public ResponseEntity<Evento> putEvento(@Valid @RequestBody Evento Evento, @PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(er.save(Evento));
    }

    @CrossOrigin
    @DeleteMapping("/evento/{id}")
    public ResponseEntity<Map<String, String>> deleteEvento(@PathVariable Long id) {
        Map<String, String> response = new HashMap<String, String>();
        try {
            er.deleteById(id);
            response.put("status", "success");
            response.put("message", "Evento deletado :)");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Algo deu errado ao deletar Evento");
            return ResponseEntity.status(500).body(response);
        }
    }
}