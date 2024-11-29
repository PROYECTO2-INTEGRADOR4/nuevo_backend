package com.pi.ppp.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.PersonaDao;
import com.pi.ppp.dto.PersonaDto;
import com.pi.ppp.entity.Persona;
import com.pi.ppp.repository.PersonaRepository;
import com.pi.ppp.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	@Autowired
	private PersonaDao dao;
	
	@Autowired
    private PersonaRepository repository;
	
	@Override
	public Persona create(Persona pe) {
		// TODO Auto-generated method stub
		return dao.create(pe);
	}

	@Override
	public Persona update(Persona pe) {
		// TODO Auto-generated method stub
		return dao.update(pe);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Persona> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

	@Override
	public List<PersonaDto> obtenerPersonasConDetalles() {
		// TODO Auto-generated method stub
		List<Persona> personas = repository.findAll();
		List<PersonaDto> personasConDetalles = new ArrayList<>();
	    for (Persona persona : personas) {
	        // Verifica si la relación con usuario es nula para evitar excepciones
	        String email = null;
	        String carrera = null;
	        if (persona.getUsuario() != null) {
	            email = persona.getUsuario().getEmail();
	            carrera = persona.getUsuario().getCarrera().getNombre(); // Ajusta según tu modelo
	        }

	        // Crear un DTO con los datos disponibles
	        PersonaDto dto = new PersonaDto(persona.getId(), persona.getNombres(), persona.getApellidos(), persona.getDni(), persona.getTelefono(), carrera, email);
	        personasConDetalles.add(dto);
	    }
	    return personasConDetalles;
	}

}
