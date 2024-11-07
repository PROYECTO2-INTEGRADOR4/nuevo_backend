package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Proceso;

public interface ProcesoDao {
	Proceso create(Proceso po);
	Proceso update(Proceso po);
	void delete(Long id);
	Optional<Proceso> read(Long id);
	List<Proceso> readAll();
}
