package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Carreraplan;

public interface CarreraplanDao {
	Carreraplan create(Carreraplan cp);
	Carreraplan update(Carreraplan cp);
	void delete(Long id);
	Optional<Carreraplan> read(Long id);
	List<Carreraplan> readAll();
}
