package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pi.ppp.entity.Usuario;
import com.pi.ppp.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Override
	public Usuario create(Usuario us) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario update(Usuario us) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
