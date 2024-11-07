package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Actividad;

public interface ActividadService {
	Actividad create(Actividad at);
	Actividad update(Actividad at);
	void delete(Long id);
	Optional<Actividad> read(Long id);
	List<Actividad> readAll();
}
