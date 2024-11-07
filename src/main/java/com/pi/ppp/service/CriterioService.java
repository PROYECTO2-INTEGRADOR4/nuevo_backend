package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Criterio;

public interface CriterioService {
	Criterio create(Criterio ci);
	Criterio update(Criterio ci);
	void delete(Long id);
	Optional<Criterio> read(Long id);
	List<Criterio> readAll();
}
