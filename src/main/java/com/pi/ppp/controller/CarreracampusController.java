package com.pi.ppp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi.ppp.entity.Carreracampus;
import com.pi.ppp.service.CarreracampusService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/carreracampus")
@CrossOrigin(origins = "http://localhost:4200")
public class CarreracampusController {
	@Autowired
	private CarreracampusService service;
	
	@GetMapping
	public ResponseEntity<List<Carreracampus>> readAll() {
		try {
			List<Carreracampus> carreracampus = service.readAll();
			if (carreracampus.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(carreracampus, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Carreracampus> crearCarreracampus(@Valid @RequestBody Carreracampus cc) {
		try {
			Carreracampus ca = service.create(cc);
			return new ResponseEntity<>(ca, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Carreracampus> getCarreracampusId(@PathVariable("id") Long id) {
		try {
			Carreracampus ca = service.read(id).get();
			return new ResponseEntity<>(ca, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Carreracampus> delCarreracampus(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Carreracampus> updateCarreracampus(@PathVariable("id") Long id, @Valid @RequestBody Carreracampus cc) {
		Optional<Carreracampus> ca = service.read(id);
		if (ca.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(cc), HttpStatus.OK);
			
		}
	}
}
