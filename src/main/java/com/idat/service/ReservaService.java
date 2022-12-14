package com.idat.service;

import java.util.List;

import com.idat.model.Reserva;

public interface ReservaService {
	List<Reserva> listar();
	void guardar(Reserva reserva);

}
