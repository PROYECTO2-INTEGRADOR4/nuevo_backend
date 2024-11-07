package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Detalledocumento;

public interface DetalledocumentoService {
	Detalledocumento create(Detalledocumento dd);
	Detalledocumento update(Detalledocumento dd);
	void delete(Long id);
	Optional<Detalledocumento> read(Long id);
	List<Detalledocumento> readAll();
}
