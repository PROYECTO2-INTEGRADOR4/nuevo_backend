package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Empresa;

public interface EmpresaService {
	Empresa create(Empresa em);
	Empresa update(Empresa em);
	void delete(Long id);
	Optional<Empresa> read(Long id);
	List<Empresa> readAll();
}
