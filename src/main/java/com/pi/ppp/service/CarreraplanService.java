package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Carreraplan;

public interface CarreraplanService {
	Carreraplan create(Carreraplan cp);
	Carreraplan update(Carreraplan cp);
	void delete(Long id);
	Optional<Carreraplan> read(Long id);
	List<Carreraplan> readAll();
}
