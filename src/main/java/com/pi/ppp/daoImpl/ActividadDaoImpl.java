package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.ActividadDao;
import com.pi.ppp.entity.Actividad;
import com.pi.ppp.repository.ActividadRepository;

@Component
public class ActividadDaoImpl implements ActividadDao{
	@Autowired
	private ActividadRepository repository;
	
	@Override
	public Actividad create(Actividad at) {
		// TODO Auto-generated method stub
		return repository.save(at);
	}

	@Override
	public Actividad update(Actividad at) {
		// TODO Auto-generated method stub
		return repository.save(at);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Actividad> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Actividad> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
