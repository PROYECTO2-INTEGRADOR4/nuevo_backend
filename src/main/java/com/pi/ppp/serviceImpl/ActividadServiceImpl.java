package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.ActividadDao;
import com.pi.ppp.entity.Actividad;
import com.pi.ppp.service.ActividadService;

@Service
public class ActividadServiceImpl implements ActividadService{
	@Autowired
	private ActividadDao dao;
	
	@Override
	public Actividad create(Actividad at) {
		// TODO Auto-generated method stub
		return dao.create(at);
	}

	@Override
	public Actividad update(Actividad at) {
		// TODO Auto-generated method stub
		return dao.update(at);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Actividad> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Actividad> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
