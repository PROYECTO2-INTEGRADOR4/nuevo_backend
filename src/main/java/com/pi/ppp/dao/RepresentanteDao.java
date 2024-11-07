package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Representante;

public interface RepresentanteDao {
	Representante create(Representante rp);
	Representante update(Representante rp);
	void delete(Long id);
	Optional<Representante> read(Long id);
	List<Representante> readAll();
}
