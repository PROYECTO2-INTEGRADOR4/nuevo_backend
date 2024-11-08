package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.ProcesorequisitoDao;
import com.pi.ppp.entity.Procesorequisito;
import com.pi.ppp.repository.ProcesorequisitoRepository;

@Component
public class ProcesorequisitoDaoImpl implements ProcesorequisitoDao{
	@Autowired
	private ProcesorequisitoRepository repository;
	
	@Override
	public Procesorequisito create(Procesorequisito pr) {
		// TODO Auto-generated method stub
		return repository.save(pr);
	}

	@Override
	public Procesorequisito update(Procesorequisito pr) {
		// TODO Auto-generated method stub
		return repository.save(pr);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Procesorequisito> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Procesorequisito> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
