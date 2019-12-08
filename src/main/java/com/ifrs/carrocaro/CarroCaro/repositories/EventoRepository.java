package com.ifrs.carrocaro.CarroCaro.repositories;

import com.ifrs.carrocaro.CarroCaro.models.Evento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    //List<Evento> getEventos();
    //Evento findByid(long id);
}