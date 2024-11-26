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

import com.pi.ppp.dto.AccesoDto;
import com.pi.ppp.entity.Acceso;
import com.pi.ppp.service.AccesoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/accesos")
@CrossOrigin(origins = "http://localhost:4200")
public class AccesoController {
	@Autowired
	private AccesoService service;
	
	@GetMapping
	public ResponseEntity<List<Acceso>> readAll() {
		try {
			List<Acceso> accesos = service.readAll();
			if (accesos.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(accesos, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Acceso> crearAcceso(@Valid @RequestBody Acceso ac) {
		try {
			Acceso a = service.create(ac);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Acceso> getAccesoId(@PathVariable("id") Long id) {
		try {
			Acceso a = service.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Acceso> delAcceso(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Acceso> updateAcceso(@PathVariable("id") Long id, @Valid @RequestBody Acceso ac) {
		Optional<Acceso> a = service.read(id);
		if (a.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(ac), HttpStatus.OK);
			
		}
	}
	
	/**
     * Endpoint para obtener los accesos jerárquicos por rol.
     * @param idRol ID del rol para el que se quieren obtener los accesos.
     * @return Lista de accesos jerárquicos en formato DTO.
     */
    @GetMapping("/por-rol/{idRol}")
    public List<AccesoDto> obtenerAccesosPorRol(@PathVariable Long idRol) {
        return service.obtenerAccesosJerarquicosPorRol(idRol);
    }
	
	
}
