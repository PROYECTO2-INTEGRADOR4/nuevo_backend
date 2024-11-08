package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.PppDao;
import com.pi.ppp.entity.Ppp;
import com.pi.ppp.service.PppService;

@Service
public class PppServiceImpl implements PppService{
	@Autowired
	private PppDao dao;
	
	@Override
	public Ppp create(Ppp pp) {
		// TODO Auto-generated method stub
		return dao.create(pp);
	}

	@Override
	public Ppp update(Ppp pp) {
		// TODO Auto-generated method stub
		return dao.update(pp);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Ppp> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Ppp> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
