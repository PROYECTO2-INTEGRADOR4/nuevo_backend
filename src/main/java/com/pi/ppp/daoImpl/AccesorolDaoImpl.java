package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.AccesorolDao;
import com.pi.ppp.entity.Accesorol;
import com.pi.ppp.repository.AccesorolRepository;

@Component
public class AccesorolDaoImpl implements AccesorolDao{
	@Autowired
	private AccesorolRepository repository;
	
	@Override
	public Accesorol create(Accesorol ar) {
		// TODO Auto-generated method stub
		return repository.save(ar);
	}

	@Override
	public Accesorol update(Accesorol ar) {
		// TODO Auto-generated method stub
		return repository.save(ar);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Accesorol> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Accesorol> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
