package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.RolDao;
import com.pi.ppp.entity.Rol;
import com.pi.ppp.repository.RolRepository;

@Component
public class RolDaoImpl implements RolDao{
	@Autowired
	private RolRepository repository;
	
	@Override
	public Rol create(Rol ro) {
		// TODO Auto-generated method stub
		return repository.save(ro);
	}

	@Override
	public Rol update(Rol ro) {
		// TODO Auto-generated method stub
		return repository.save(ro);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
