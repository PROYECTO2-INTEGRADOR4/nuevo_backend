package com.pi.ppp.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.pi.ppp.entity.Usuario;

public interface UsuarioService {
	Usuario create(Usuario us);
	Usuario update(Usuario us);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();
	Optional<Usuario> findByUsername(String username);
    List<Map<String, Object>> obtenerUsuariosPorCarrera();

}
