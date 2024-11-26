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

import com.pi.ppp.entity.Requisito;
import com.pi.ppp.service.RequisitoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/requisitos")
@CrossOrigin(origins = "http://localhost:4200")
public class RequisitoController {
	@Autowired
	private RequisitoService service;
	
	@GetMapping
	public ResponseEntity<List<Requisito>> readAll() {
		try {
			List<Requisito> requisitos = service.readAll();
			if (requisitos.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(requisitos, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Requisito> crearRequisito(@Valid @RequestBody Requisito re) {
		try {
			Requisito r = service.create(re);
			return new ResponseEntity<>(r, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Requisito> getRequisitoId(@PathVariable("id") Long id) {
		try {
			Requisito r = service.read(id).get();
			return new ResponseEntity<>(r, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Requisito> delRequisito(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Requisito> updateRequisito(@PathVariable("id") Long id, @Valid @RequestBody Requisito re) {
		Optional<Requisito> r = service.read(id);
		if (r.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(re), HttpStatus.OK);
			
		}
	}
}
