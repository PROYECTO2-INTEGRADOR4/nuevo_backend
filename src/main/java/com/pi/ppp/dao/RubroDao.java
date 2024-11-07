package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Rubro;

public interface RubroDao {
	Rubro create(Rubro ru);
	Rubro update(Rubro ru);
	void delete(Long id);
	Optional<Rubro> read(Long id);
	List<Rubro> readAll();
}
