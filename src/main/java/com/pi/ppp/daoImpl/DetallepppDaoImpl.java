package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.DetallepppDao;
import com.pi.ppp.entity.Detalleppp;
import com.pi.ppp.repository.DetallepppRepository;

@Component
public class DetallepppDaoImpl implements DetallepppDao{
	@Autowired
	private DetallepppRepository repository;
	
	@Override
	public Detalleppp create(Detalleppp dp) {
		// TODO Auto-generated method stub
		return repository.save(dp);
	}

	@Override
	public Detalleppp update(Detalleppp dp) {
		// TODO Auto-generated method stub
		return repository.save(dp);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Detalleppp> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Detalleppp> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
