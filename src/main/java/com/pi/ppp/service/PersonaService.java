package com.pi.ppp.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.pi.ppp.dto.PersonaDto;
import com.pi.ppp.entity.Persona;

public interface PersonaService {
	Persona create(Persona pe);
	Persona update(Persona pe);
	void delete(Long id);
	Optional<Persona> read(Long id);
	List<Persona> readAll();
	List<PersonaDto> obtenerPersonasConDetalles();
}
