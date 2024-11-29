package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.dto.AccesoDto;
import com.pi.ppp.entity.Acceso;

public interface AccesoService {
	Acceso create(Acceso ac);
	Acceso update(Acceso ac);
	void delete(Long id);
	Optional<Acceso> read(Long id);
	List<Acceso> readAll();
	List<AccesoDto> obtenerAccesosJerarquicosPorRol(String nombreRol);
	List<AccesoDto> construirJerarquia(List<Acceso> accesos);
}
