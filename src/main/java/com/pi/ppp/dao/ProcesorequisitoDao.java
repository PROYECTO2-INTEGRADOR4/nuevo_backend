package com.pi.ppp.dao;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Procesorequisito;

public interface ProcesorequisitoDao {
	Procesorequisito create(Procesorequisito pr);
	Procesorequisito update(Procesorequisito pr);
	void delete(Long id);
	Optional<Procesorequisito> read(Long id);
	List<Procesorequisito> readAll();
}
