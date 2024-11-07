package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Evaluacion;

public interface EvaluacionService {
	Evaluacion create(Evaluacion ev);
	Evaluacion update(Evaluacion ev);
	void delete(Long id);
	Optional<Evaluacion> read(Long id);
	List<Evaluacion> readAll();
}
