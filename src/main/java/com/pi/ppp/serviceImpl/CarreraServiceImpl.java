package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.CarreraDao;
import com.pi.ppp.entity.Carrera;
import com.pi.ppp.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService{
	@Autowired
	private CarreraDao dao;
	
	@Override
	public Carrera create(Carrera cr) {
		// TODO Auto-generated method stub
		return dao.create(cr);
	}

	@Override
	public Carrera update(Carrera cr) {
		// TODO Auto-generated method stub
		return dao.update(cr);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
