package com.ifrs.carrocaro.CarroCaro.repositories;

import java.util.List;

import com.ifrs.carrocaro.CarroCaro.models.Carro;

import org.springframework.data.jpa.repository.JpaRepository;

interface CarroRepository extends JpaRepository<Carro, Long> {
    List<Carro> getCarros();
}