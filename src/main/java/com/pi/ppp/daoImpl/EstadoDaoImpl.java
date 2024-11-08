package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.EstadoDao;
import com.pi.ppp.entity.Estado;
import com.pi.ppp.repository.EstadoRepository;

@Component
public class EstadoDaoImpl implements EstadoDao{
	@Autowired
	private EstadoRepository repository;
	
	@Override
	public Estado create(Estado es) {
		// TODO Auto-generated method stub
		return repository.save(es);
	}

	@Override
	public Estado update(Estado es) {
		// TODO Auto-generated method stub
		return repository.save(es);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Estado> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Estado> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
