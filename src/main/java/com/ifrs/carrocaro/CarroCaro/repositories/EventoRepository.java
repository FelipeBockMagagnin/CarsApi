package com.ifrs.carrocaro.CarroCaro.repositories;

import java.util.List;

import com.ifrs.carrocaro.CarroCaro.models.Evento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    //List<Evento> getEventos();
    //Evento findByid(long id);

    @Query("select a from evento e where e.data between :TimeStart and :TimeEnd")
    public List<Evento> findAllbyTempo(@Param("TimeStart") String TimeStart, @Param("TimeEnd") String TimeEnd);
}