package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Acceso;

public interface AccesoDao {
	Acceso create(Acceso ac);
	Acceso update(Acceso ac);
	void delete(Long id);
	Optional<Acceso> read(Long id);
	List<Acceso> readAll();
}
