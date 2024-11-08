package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.PppDao;
import com.pi.ppp.entity.Ppp;
import com.pi.ppp.repository.PppRepository;

@Component
public class PppDaoImpl implements PppDao{
	@Autowired
	private PppRepository repository;
	
	@Override
	public Ppp create(Ppp pp) {
		// TODO Auto-generated method stub
		return repository.save(pp);
	}

	@Override
	public Ppp update(Ppp pp) {
		// TODO Auto-generated method stub
		return repository.save(pp);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Ppp> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Ppp> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
