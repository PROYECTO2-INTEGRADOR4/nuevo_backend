package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.LineaDao;
import com.pi.ppp.entity.Linea;
import com.pi.ppp.service.LineaService;

@Service
public class LineaServiceImpl implements LineaService{
	@Autowired
	private LineaDao dao;
	
	@Override
	public Linea create(Linea li) {
		// TODO Auto-generated method stub
		return dao.create(li);
	}

	@Override
	public Linea update(Linea li) {
		// TODO Auto-generated method stub
		return dao.update(li);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Linea> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Linea> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
