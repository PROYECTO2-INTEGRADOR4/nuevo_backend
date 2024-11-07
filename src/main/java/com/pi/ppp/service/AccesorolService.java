package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Accesorol;

public interface AccesorolService {
	Accesorol create(Accesorol ar);
	Accesorol update(Accesorol ar);
	void delete(Long id);
	Optional<Accesorol> read(Long id);
	List<Accesorol> readAll();
}
