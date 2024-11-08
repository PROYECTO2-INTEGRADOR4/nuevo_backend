package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.EstudianteDao;
import com.pi.ppp.entity.Estudiante;
import com.pi.ppp.repository.EstudianteRepository;

@Component
public class EstudianteDaoImpl implements EstudianteDao{
	@Autowired
	private EstudianteRepository repository;
	
	@Override
	public Estudiante create(Estudiante st) {
		// TODO Auto-generated method stub
		return repository.save(st);
	}

	@Override
	public Estudiante update(Estudiante st) {
		// TODO Auto-generated method stub
		return repository.save(st);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Estudiante> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Estudiante> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
