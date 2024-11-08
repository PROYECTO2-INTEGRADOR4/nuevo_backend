package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.RubroDao;
import com.pi.ppp.entity.Rubro;
import com.pi.ppp.repository.RubroRepository;

@Component
public class RubroDaoImpl implements RubroDao{
	@Autowired
	private RubroRepository repository;
	
	@Override
	public Rubro create(Rubro ru) {
		// TODO Auto-generated method stub
		return repository.save(ru);
	}

	@Override
	public Rubro update(Rubro ru) {
		// TODO Auto-generated method stub
		return repository.save(ru);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Rubro> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Rubro> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
