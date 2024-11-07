package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Linea;

public interface LineaService {
	Linea create(Linea li);
	Linea update(Linea li);
	void delete(Long id);
	Optional<Linea> read(Long id);
	List<Linea> readAll();
}
