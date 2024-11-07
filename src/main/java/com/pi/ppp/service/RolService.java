package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Rol;

public interface RolService {
	Rol create(Rol ro);
	Rol update(Rol ro);
	void delete(Long id);
	Optional<Rol> read(Long id);
	List<Rol> readAll();
}
