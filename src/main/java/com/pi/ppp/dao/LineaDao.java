package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Linea;

public interface LineaDao {
	Linea create(Linea li);
	Linea update(Linea li);
	void delete(Long id);
	Optional<Linea> read(Long id);
	List<Linea> readAll();
}
