package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.CarreraplanDao;
import com.pi.ppp.entity.Carreraplan;
import com.pi.ppp.service.CarreraplanService;

@Service
public class CarreraplanServiceImpl implements CarreraplanService{
	@Autowired
	private CarreraplanDao dao;
	
	@Override
	public Carreraplan create(Carreraplan cp) {
		// TODO Auto-generated method stub
		return dao.create(cp);
	}

	@Override
	public Carreraplan update(Carreraplan cp) {
		// TODO Auto-generated method stub
		return dao.update(cp);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Carreraplan> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Carreraplan> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
