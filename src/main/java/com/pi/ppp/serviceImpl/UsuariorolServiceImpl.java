package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.UsuariorolDao;
import com.pi.ppp.entity.Usuariorol;
import com.pi.ppp.service.UsuariorolService;

@Service
public class UsuariorolServiceImpl implements UsuariorolService{
	@Autowired
	private UsuariorolDao dao;
	
	@Override
	public Usuariorol create(Usuariorol ur) {
		// TODO Auto-generated method stub
		return dao.create(ur);
	}

	@Override
	public Usuariorol update(Usuariorol ur) {
		// TODO Auto-generated method stub
		return dao.update(ur);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Usuariorol> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Usuariorol> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
