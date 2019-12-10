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
    
    List<Evento> findAllByid_carro(long id_carro);

    // @Query("select * from evento e where e.data between :TimeStart and :TimeEnd")
    //public List<Evento> findAllbyData(@Param("TimeStart") String TimeStart, @Param("TimeEnd") String TimeEnd);
}