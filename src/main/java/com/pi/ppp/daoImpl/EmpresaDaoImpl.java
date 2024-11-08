package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.EmpresaDao;
import com.pi.ppp.entity.Empresa;
import com.pi.ppp.repository.EmpresaRepository;

@Component
public class EmpresaDaoImpl implements EmpresaDao{
	@Autowired
	private EmpresaRepository repository;
	
	@Override
	public Empresa create(Empresa em) {
		// TODO Auto-generated method stub
		return repository.save(em);
	}

	@Override
	public Empresa update(Empresa em) {
		// TODO Auto-generated method stub
		return repository.save(em);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Empresa> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Empresa> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
