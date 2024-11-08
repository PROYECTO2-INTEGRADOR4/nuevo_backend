package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.MatriculaDao;
import com.pi.ppp.entity.Matricula;
import com.pi.ppp.repository.MatriculaRepository;

@Component
public class MatriculaDaoImpl implements MatriculaDao{
	@Autowired
	private MatriculaRepository repository;
	
	@Override
	public Matricula create(Matricula ma) {
		// TODO Auto-generated method stub
		return repository.save(ma);
	}

	@Override
	public Matricula update(Matricula ma) {
		// TODO Auto-generated method stub
		return repository.save(ma);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
