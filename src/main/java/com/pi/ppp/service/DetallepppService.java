package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Detalleppp;

public interface DetallepppService {
	Detalleppp create(Detalleppp dp);
	Detalleppp update(Detalleppp dp);
	void delete(Long id);
	Optional<Detalleppp> read(Long id);
	List<Detalleppp> readAll();
}
