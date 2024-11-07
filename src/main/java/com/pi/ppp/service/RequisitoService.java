package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Requisito;

public interface RequisitoService {
	Requisito create(Requisito re);
	Requisito update(Requisito re);
	void delete(Long id);
	Optional<Requisito> read(Long id);
	List<Requisito> readAll();
}
