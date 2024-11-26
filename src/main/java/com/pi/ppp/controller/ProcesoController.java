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

import com.pi.ppp.entity.Proceso;
import com.pi.ppp.service.ProcesoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/procesos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProcesoController {
	@Autowired
	private ProcesoService service;
	
	@GetMapping
	public ResponseEntity<List<Proceso>> readAll() {
		try {
			List<Proceso> procesos = service.readAll();
			if (procesos.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(procesos, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Proceso> crearProceso(@Valid @RequestBody Proceso po) {
		try {
			Proceso p = service.create(po);
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Proceso> getProcesoId(@PathVariable("id") Long id) {
		try {
			Proceso p = service.read(id).get();
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Proceso> delProceso(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Proceso> updateProceso(@PathVariable("id") Long id, @Valid @RequestBody Proceso po) {
		Optional<Proceso> p = service.read(id);
		if (p.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(po), HttpStatus.OK);
			
		}
	}
}
