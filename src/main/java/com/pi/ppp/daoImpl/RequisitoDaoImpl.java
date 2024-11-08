package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.RequisitoDao;
import com.pi.ppp.entity.Requisito;
import com.pi.ppp.repository.RequisitoRepository;

@Component
public class RequisitoDaoImpl implements RequisitoDao{
	@Autowired
	private RequisitoRepository repository;
	
	@Override
	public Requisito create(Requisito re) {
		// TODO Auto-generated method stub
		return repository.save(re);
	}

	@Override
	public Requisito update(Requisito re) {
		// TODO Auto-generated method stub
		return repository.save(re);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Requisito> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Requisito> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
