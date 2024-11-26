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

import com.pi.ppp.entity.Detalledocumento;
import com.pi.ppp.service.DetalledocumentoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/detalledocumentos")
@CrossOrigin(origins = "http://localhost:4200")
public class DetalledocumentoController {
	@Autowired
	private DetalledocumentoService service;
	
	@GetMapping
	public ResponseEntity<List<Detalledocumento>> readAll() {
		try {
			List<Detalledocumento> detalledocumentos = service.readAll();
			if (detalledocumentos.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(detalledocumentos, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Detalledocumento> crearDetalledocumento(@Valid @RequestBody Detalledocumento dd) {
		try {
			Detalledocumento d = service.create(dd);
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Detalledocumento> getDetalledocumentoId(@PathVariable("id") Long id) {
		try {
			Detalledocumento d = service.read(id).get();
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Detalledocumento> delDetalledocumento(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Detalledocumento> updateDetalledocumento(@PathVariable("id") Long id, @Valid @RequestBody Detalledocumento dd) {
		Optional<Detalledocumento> d = service.read(id);
		if (d.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(dd), HttpStatus.OK);
			
		}
	}
}
