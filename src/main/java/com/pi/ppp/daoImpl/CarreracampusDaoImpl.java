package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.CarreracampusDao;
import com.pi.ppp.entity.Carreracampus;
import com.pi.ppp.repository.CarreracampusRepository;

@Component
public class CarreracampusDaoImpl implements CarreracampusDao{
	@Autowired
	private CarreracampusRepository repository;
	
	@Override
	public Carreracampus create(Carreracampus cc) {
		// TODO Auto-generated method stub
		return repository.save(cc);
	}

	@Override
	public Carreracampus update(Carreracampus cc) {
		// TODO Auto-generated method stub
		return repository.save(cc);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Carreracampus> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Carreracampus> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
