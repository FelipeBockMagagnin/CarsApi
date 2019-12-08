package com.ifrs.carrocaro.CarroCaro.repositories;

import com.ifrs.carrocaro.CarroCaro.models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {}