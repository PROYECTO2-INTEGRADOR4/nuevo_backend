package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.CriterioDao;
import com.pi.ppp.entity.Criterio;
import com.pi.ppp.service.CriterioService;

@Service
public class CriterioServiceImpl implements CriterioService{
	@Autowired
	private CriterioDao dao;
	
	@Override
	public Criterio create(Criterio ci) {
		// TODO Auto-generated method stub
		return dao.create(ci);
	}

	@Override
	public Criterio update(Criterio ci) {
		// TODO Auto-generated method stub
		return dao.update(ci);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Criterio> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Criterio> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
