package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.CriterioDao;
import com.pi.ppp.entity.Criterio;
import com.pi.ppp.repository.CriterioRepository;

@Component
public class CriterioDaoImpl implements CriterioDao{
	@Autowired
	private CriterioRepository repository;
	
	@Override
	public Criterio create(Criterio ci) {
		// TODO Auto-generated method stub
		return repository.save(ci);
	}

	@Override
	public Criterio update(Criterio ci) {
		// TODO Auto-generated method stub
		return repository.save(ci);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Criterio> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Criterio> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
