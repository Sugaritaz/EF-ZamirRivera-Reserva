package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.model.Reserva;

public interface ReservaRepository extends JpaRepository <Reserva, Integer> {

}
