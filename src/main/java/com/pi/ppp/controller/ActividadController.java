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

import com.pi.ppp.entity.Actividad;
import com.pi.ppp.service.ActividadService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/actividades")
@CrossOrigin(origins = "http://localhost:4200")
public class ActividadController {
	@Autowired
	private ActividadService service;
	
	@GetMapping
	public ResponseEntity<List<Actividad>> readAll() {
		try {
			List<Actividad> Actividads = service.readAll();
			if (Actividads.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(Actividads, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Actividad> crearActividad(@Valid @RequestBody Actividad at) {
		try {
			Actividad a = service.create(at);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Actividad> getActividadId(@PathVariable("id") Long id) {
		try {
			Actividad a = service.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Actividad> delActividad(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Actividad> updateActividad(@PathVariable("id") Long id, @Valid @RequestBody Actividad at) {
		Optional<Actividad> a = service.read(id);
		if (a.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(at), HttpStatus.OK);
			
		}
	}
}
