package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.pi.ppp.dao.AccesoDao;
import com.pi.ppp.entity.Acceso;

@Component
public class AccesoDaoImpl implements AccesoDao{

	@Override
	public Acceso create(Acceso ac) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acceso update(Acceso ac) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
