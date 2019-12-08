package com.ifrs.carrocaro.CarroCaro.repositories;

import com.ifrs.carrocaro.CarroCaro.models.Evento;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Long> {
    //List<Evento> getEventos();
    //Evento findByid(long id);
}