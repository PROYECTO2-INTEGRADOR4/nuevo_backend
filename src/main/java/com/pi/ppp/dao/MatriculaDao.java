package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Matricula;

public interface MatriculaDao {
	Matricula create(Matricula ma);
	Matricula update(Matricula ma);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();
}
