package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Empresa;

public interface EmpresaDao {
	Empresa create(Empresa em);
	Empresa update(Empresa em);
	void delete(Long id);
	Optional<Empresa> read(Long id);
	List<Empresa> readAll();
}
