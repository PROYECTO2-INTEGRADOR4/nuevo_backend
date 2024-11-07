package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Ppp;

public interface PppDao {
	Ppp create(Ppp pp);
	Ppp update(Ppp pp);
	void delete(Long id);
	Optional<Ppp> read(Long id);
	List<Ppp> readAll();
}
