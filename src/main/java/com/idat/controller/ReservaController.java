package com.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.idat.model.Reserva;
import com.idat.service.ReservaService;


@Controller
@RequestMapping("/api/Reserva/v1")
public class ReservaController {

	@Autowired
	private ReservaService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Reserva>> listar(){
		return new ResponseEntity<List<Reserva>>(service.listar(), HttpStatus.OK) ;
	}
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Reserva turista ){
		service.guardar(turista);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}

