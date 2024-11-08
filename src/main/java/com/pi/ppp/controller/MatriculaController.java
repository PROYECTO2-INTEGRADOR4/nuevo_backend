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

import com.pi.ppp.entity.Matricula;
import com.pi.ppp.service.MatriculaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/matriculas")
@CrossOrigin(origins = "http://localhost:4200")
public class MatriculaController {
	@Autowired
	private MatriculaService service;
	
	@GetMapping
	public ResponseEntity<List<Matricula>> readAll() {
		try {
			List<Matricula> matriculas = service.readAll();
			if (matriculas.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(matriculas, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Matricula> crearMatricula(@Valid @RequestBody Matricula ma) {
		try {
			Matricula m = service.create(ma);
			return new ResponseEntity<>(m, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Matricula> getMatriculaId(@PathVariable("id") Long id) {
		try {
			Matricula m = service.read(id).get();
			return new ResponseEntity<>(m, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Matricula> delMatricula(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Matricula> updateMatricula(@PathVariable("id") Long id, @Valid @RequestBody Matricula ma) {
		Optional<Matricula> m = service.read(id);
		if (m.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(ma), HttpStatus.OK);
			
		}
	}
}
