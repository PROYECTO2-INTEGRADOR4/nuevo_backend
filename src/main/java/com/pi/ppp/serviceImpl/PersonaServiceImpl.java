package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.PersonaDao;
import com.pi.ppp.entity.Persona;
import com.pi.ppp.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	@Autowired
	private PersonaDao dao;
	
	@Override
	public Persona create(Persona pe) {
		// TODO Auto-generated method stub
		return dao.create(pe);
	}

	@Override
	public Persona update(Persona pe) {
		// TODO Auto-generated method stub
		return dao.update(pe);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Persona> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
