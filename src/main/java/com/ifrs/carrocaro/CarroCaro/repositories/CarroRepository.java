package com.ifrs.carrocaro.CarroCaro.repositories;

import java.util.Collection;

import javax.persistence.Temporal;

import com.ifrs.carrocaro.CarroCaro.models.Carro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    //List<Carro> getCarros();
//     @Query("SELECT o FROM ConcreteOperation o WHERE o.beginTimestamp BETWEEN :from AND :to AND o.status = :status AND o.terminal.deviceId = :deviceId AND o.trainingMode = :trainingMode")
// Collection<Carro> findOperations(
//     @Param("from") @Temporal(TemporalType.TIMESTAMP) Date startDay,
//     @Param("to") @Temporal(TemporalType.TIMESTAMP) Date endDay,
//     @Param("status") OperationStatus status,
//     @Param("deviceId") String deviceId,
//     @Param("trainingMode") boolean trainingMode
// );
}