package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.CarreraplanDao;
import com.pi.ppp.entity.Carreraplan;
import com.pi.ppp.repository.CarreraplanRepository;

@Component
public class CarreraplanDaoImpl implements CarreraplanDao{
	@Autowired
	private CarreraplanRepository repository;
	
	@Override
	public Carreraplan create(Carreraplan cp) {
		// TODO Auto-generated method stub
		return repository.save(cp);
	}

	@Override
	public Carreraplan update(Carreraplan cp) {
		// TODO Auto-generated method stub
		return repository.save(cp);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Carreraplan> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Carreraplan> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
