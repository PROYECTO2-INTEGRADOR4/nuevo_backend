package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.AccesoDao;
import com.pi.ppp.entity.Acceso;
import com.pi.ppp.repository.AccesoRepository;

@Component
public class AccesoDaoImpl implements AccesoDao{
	@Autowired
	private AccesoRepository repository;
	
	@Override
	public Acceso create(Acceso ac) {
		// TODO Auto-generated method stub
		return repository.save(ac);
	}

	@Override
	public Acceso update(Acceso ac) {
		// TODO Auto-generated method stub
		return repository.save(ac);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
