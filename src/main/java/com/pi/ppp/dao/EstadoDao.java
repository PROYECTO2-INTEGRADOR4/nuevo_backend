package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Estado;

public interface EstadoDao {
	Estado create(Estado es);
	Estado update(Estado es);
	void delete(Long id);
	Optional<Estado> read(Long id);
	List<Estado> readAll();
}
