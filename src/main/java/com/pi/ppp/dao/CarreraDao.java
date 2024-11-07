package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Carrera;

public interface CarreraDao {
	Carrera create(Carrera cr);
	Carrera update(Carrera cr);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();
}
