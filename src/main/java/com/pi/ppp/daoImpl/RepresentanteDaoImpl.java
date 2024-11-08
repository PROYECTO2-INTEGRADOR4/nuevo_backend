package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.RepresentanteDao;
import com.pi.ppp.entity.Representante;
import com.pi.ppp.repository.RepresentanteRepository;

@Component
public class RepresentanteDaoImpl implements RepresentanteDao{
	@Autowired
	private RepresentanteRepository repository;
	
	@Override
	public Representante create(Representante rp) {
		// TODO Auto-generated method stub
		return repository.save(rp);
	}

	@Override
	public Representante update(Representante rp) {
		// TODO Auto-generated method stub
		return repository.save(rp);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Representante> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Representante> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
