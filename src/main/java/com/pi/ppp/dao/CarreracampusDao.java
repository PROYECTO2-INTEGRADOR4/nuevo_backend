package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Carreracampus;

public interface CarreracampusDao {
	Carreracampus create(Carreracampus cc);
	Carreracampus update(Carreracampus cc);
	void delete(Long id);
	Optional<Carreracampus> read(Long id);
	List<Carreracampus> readAll();
}
