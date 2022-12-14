package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.model.Reserva;
import com.idat.repository.ReservaRepository;

public class ReservaServiceImpl implements ReservaService{

	@Autowired
	private ReservaRepository repository;
	
	@Override
	public List<Reserva> listar() {
		return repository.findAll();
	}

	@Override
	public void guardar(Reserva reserva) {
		repository.save(reserva);
		
	}

}
