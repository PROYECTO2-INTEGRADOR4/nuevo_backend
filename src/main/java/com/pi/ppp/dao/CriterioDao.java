package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Criterio;

public interface CriterioDao {
	Criterio create(Criterio ci);
	Criterio update(Criterio ci);
	void delete(Long id);
	Optional<Criterio> read(Long id);
	List<Criterio> readAll();
}
