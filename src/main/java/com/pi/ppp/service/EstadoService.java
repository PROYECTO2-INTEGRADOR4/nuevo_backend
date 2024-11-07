package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Estado;

public interface EstadoService {
	Estado create(Estado es);
	Estado update(Estado es);
	void delete(Long id);
	Optional<Estado> read(Long id);
	List<Estado> readAll();
}
