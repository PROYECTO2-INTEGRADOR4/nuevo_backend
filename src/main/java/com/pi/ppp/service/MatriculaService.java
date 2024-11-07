package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Matricula;

public interface MatriculaService {
	Matricula create(Matricula ma);
	Matricula update(Matricula ma);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();
}
