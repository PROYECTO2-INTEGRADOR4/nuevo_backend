package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Actividad;

public interface ActividadDao {
	Actividad create(Actividad at);
	Actividad update(Actividad at);
	void delete(Long id);
	Optional<Actividad> read(Long id);
	List<Actividad> readAll();
}
