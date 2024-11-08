package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.LineaDao;
import com.pi.ppp.entity.Linea;
import com.pi.ppp.repository.LineaRepository;

@Component
public class LineaDaoImpl implements LineaDao{
	@Autowired
	private LineaRepository repository;
	
	@Override
	public Linea create(Linea li) {
		// TODO Auto-generated method stub
		return repository.save(li);
	}

	@Override
	public Linea update(Linea li) {
		// TODO Auto-generated method stub
		return repository.save(li);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Linea> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Linea> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
