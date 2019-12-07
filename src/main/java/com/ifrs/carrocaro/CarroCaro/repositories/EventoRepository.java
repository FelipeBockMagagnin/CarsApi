package com.ifrs.carrocaro.CarroCaro.repositories;

import java.util.List;

import com.ifrs.carrocaro.CarroCaro.models.Evento;

import org.springframework.data.jpa.repository.JpaRepository;

interface EventoRepository extends JpaRepository<Evento, Long> {
    //List<Evento> getEventos();
}