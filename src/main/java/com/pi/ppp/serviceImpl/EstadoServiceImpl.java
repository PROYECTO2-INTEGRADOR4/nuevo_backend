package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.EstadoDao;
import com.pi.ppp.entity.Estado;
import com.pi.ppp.service.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService{
	@Autowired
	private EstadoDao dao;
	
	@Override
	public Estado create(Estado es) {
		// TODO Auto-generated method stub
		return dao.create(es);
	}

	@Override
	public Estado update(Estado es) {
		// TODO Auto-generated method stub
		return dao.update(es);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Estado> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Estado> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
