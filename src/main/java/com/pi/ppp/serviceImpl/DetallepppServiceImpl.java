package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.DetallepppDao;
import com.pi.ppp.entity.Detalleppp;
import com.pi.ppp.service.DetallepppService;

@Service
public class DetallepppServiceImpl implements DetallepppService{
	@Autowired
	private DetallepppDao dao;
	
	@Override
	public Detalleppp create(Detalleppp dp) {
		// TODO Auto-generated method stub
		return dao.create(dp);
	}

	@Override
	public Detalleppp update(Detalleppp dp) {
		// TODO Auto-generated method stub
		return dao.update(dp);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Detalleppp> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Detalleppp> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
