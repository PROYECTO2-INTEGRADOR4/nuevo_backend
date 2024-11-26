package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.UsuarioDao;
import com.pi.ppp.entity.Usuario;
import com.pi.ppp.repository.UsuarioRepository;

@Component
public class UsuarioDaoImpl implements UsuarioDao{
	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario create(Usuario us) {
		// TODO Auto-generated method stub
		return repository.save(us);
	}

	@Override
	public Usuario update(Usuario us) {
		// TODO Auto-generated method stub
		return repository.save(us);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	@Override
	public Optional<Usuario> findByUsername(String username) {
		return repository.findByUsername(username);
	}

}
