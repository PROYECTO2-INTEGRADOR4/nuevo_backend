package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Persona;

public interface PersonaDao {
	Persona create(Persona pe);
	Persona update(Persona pe);
	void delete(Long id);
	Optional<Persona> read(Long id);
	List<Persona> readAll();
}
