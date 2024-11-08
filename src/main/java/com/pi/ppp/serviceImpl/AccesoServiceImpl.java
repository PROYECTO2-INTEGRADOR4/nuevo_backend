package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.AccesoDao;
import com.pi.ppp.entity.Acceso;
import com.pi.ppp.service.AccesoService;

@Service
public class AccesoServiceImpl implements AccesoService{
	@Autowired
	private AccesoDao dao;
	
	@Override
	public Acceso create(Acceso ac) {
		// TODO Auto-generated method stub
		return dao.create(ac);
	}

	@Override
	public Acceso update(Acceso ac) {
		// TODO Auto-generated method stub
		return dao.update(ac);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
