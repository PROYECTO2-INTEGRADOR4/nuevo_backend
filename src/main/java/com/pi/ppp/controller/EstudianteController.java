package com.pi.ppp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi.ppp.dto.EstudianteDto;
import com.pi.ppp.entity.Estudiante;
import com.pi.ppp.service.EstudianteService;
import com.pi.ppp.serviceImpl.EstudianteDtoServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin(origins = "http://localhost:4200")
public class EstudianteController {
	@Autowired
	private EstudianteService service;
	
	@Autowired
	private EstudianteDtoServiceImpl esService;
	
	@GetMapping
	public ResponseEntity<List<Estudiante>> readAll() {
		try {
			List<Estudiante> estudiantes = service.readAll();
			if (estudiantes.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(estudiantes, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Estudiante> crearEstudiante(@Valid @RequestBody Estudiante st) {
		try {
			Estudiante e = service.create(st);
			return new ResponseEntity<>(e, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Estudiante> getEstudianteId(@PathVariable("id") Long id) {
		try {
			Estudiante e = service.read(id).get();
			return new ResponseEntity<>(e, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Estudiante> delEstudiante(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Estudiante> updateEstudiante(@PathVariable("id") Long id, @Valid @RequestBody Estudiante st) {
		Optional<Estudiante> e = service.read(id);
		if (e.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(service.update(st), HttpStatus.OK);
			
		}
	}
	
	@PreAuthorize("hasRole('ESTUDIANTE')")
	@GetMapping("/datos/{username}")
	public ResponseEntity<EstudianteDto> obtenerDatosEstudiante(@PathVariable String username) {
		EstudianteDto estudiante = esService.obtenerDatosEstudiante(username);
		return ResponseEntity.ok(estudiante);
	} 

}
