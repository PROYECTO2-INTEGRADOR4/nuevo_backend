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

import com.pi.ppp.entity.Procesorequisito;
import com.pi.ppp.service.ProcesorequisitoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/procesosrequisitos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProcesorequisitoController {
	@Autowired
	private ProcesorequisitoService service;
	
	@GetMapping
	public ResponseEntity<List<Procesorequisito>> readAll() {
		try {
			List<Procesorequisito> procesorequisitos = service.readAll();
			if (procesorequisitos.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(procesorequisitos, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Procesorequisito> crearProcesorequisito(@Valid @RequestBody Procesorequisito pr) {
		try {
			Procesorequisito p = service.create(pr);
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Procesorequisito> getProcesorequisitoId(@PathVariable("id") Long id) {
		try {
			Procesorequisito p = service.read(id).get();
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Procesorequisito> delProcesorequisito(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Procesorequisito> updateProcesorequisito(@PathVariable("id") Long id, @Valid @RequestBody Procesorequisito pr) {
		Optional<Procesorequisito> p = service.read(id);
		if (p.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(pr), HttpStatus.OK);
			
		}
	}
}
