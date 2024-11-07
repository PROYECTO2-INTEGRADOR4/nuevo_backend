package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Usuariorol;

public interface UsuariorolService {
	Usuariorol create(Usuariorol ur);
	Usuariorol update(Usuariorol ur);
	void delete(Long id);
	Optional<Usuariorol> read(Long id);
	List<Usuariorol> readAll();
}
