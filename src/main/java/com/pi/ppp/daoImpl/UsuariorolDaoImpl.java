package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.UsuariorolDao;
import com.pi.ppp.entity.Usuariorol;
import com.pi.ppp.repository.UsuariorolRepository;

@Component
public class UsuariorolDaoImpl implements UsuariorolDao{
	@Autowired
	private UsuariorolRepository repository;
	
	@Override
	public Usuariorol create(Usuariorol ur) {
		// TODO Auto-generated method stub
		return repository.save(ur);
	}

	@Override
	public Usuariorol update(Usuariorol ur) {
		// TODO Auto-generated method stub
		return repository.save(ur);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Usuariorol> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Usuariorol> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
