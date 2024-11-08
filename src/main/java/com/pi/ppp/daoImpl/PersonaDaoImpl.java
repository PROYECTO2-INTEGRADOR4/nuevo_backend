package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.PersonaDao;
import com.pi.ppp.entity.Persona;
import com.pi.ppp.repository.PersonaRepository;

@Component
public class PersonaDaoImpl implements PersonaDao{
	@Autowired
	private PersonaRepository repository;
	
	@Override
	public Persona create(Persona pe) {
		// TODO Auto-generated method stub
		return repository.save(pe);
	}

	@Override
	public Persona update(Persona pe) {
		// TODO Auto-generated method stub
		return repository.save(pe);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Persona> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
