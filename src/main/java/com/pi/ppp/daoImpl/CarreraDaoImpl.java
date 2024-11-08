package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.CarreraDao;
import com.pi.ppp.entity.Carrera;
import com.pi.ppp.repository.CarreraRepository;

@Component
public class CarreraDaoImpl implements CarreraDao{
	@Autowired
	private CarreraRepository repository;
	
	@Override
	public Carrera create(Carrera cr) {
		// TODO Auto-generated method stub
		return repository.save(cr);
	}

	@Override
	public Carrera update(Carrera cr) {
		// TODO Auto-generated method stub
		return repository.save(cr);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
