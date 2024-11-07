package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Procesorequisito;

public interface ProcesorequisitoService {
	Procesorequisito create(Procesorequisito pr);
	Procesorequisito update(Procesorequisito pr);
	void delete(Long id);
	Optional<Procesorequisito> read(Long id);
	List<Procesorequisito> readAll();
}
