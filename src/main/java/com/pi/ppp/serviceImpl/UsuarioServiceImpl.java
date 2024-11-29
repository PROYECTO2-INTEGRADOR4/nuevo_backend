package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.UsuarioDao;
import com.pi.ppp.entity.Usuario;
import com.pi.ppp.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioDao dao;
	
	@Override
	public Usuario create(Usuario us) {
		// TODO Auto-generated method stub
		return dao.create(us);
	}

	@Override
	public Usuario update(Usuario us) {
		// TODO Auto-generated method stub
		return dao.update(us);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
	@Override
	public Optional<Usuario> findByUsername(String username) {
		// TODO Auto-generated method stub
		return dao.findByUsername(username);
	}

	@Override
	public List<Map<String, Object>> obtenerUsuariosPorCarrera() {
		// TODO Auto-generated method stub
		return dao.obtenerUsuariosPorCarrera();
	}

}
