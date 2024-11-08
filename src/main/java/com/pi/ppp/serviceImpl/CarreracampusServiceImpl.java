package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.CarreracampusDao;
import com.pi.ppp.entity.Carreracampus;
import com.pi.ppp.service.CarreracampusService;

@Service
public class CarreracampusServiceImpl implements CarreracampusService{
	@Autowired
	private CarreracampusDao dao;
	
	@Override
	public Carreracampus create(Carreracampus cc) {
		// TODO Auto-generated method stub
		return dao.create(cc);
	}

	@Override
	public Carreracampus update(Carreracampus cc) {
		// TODO Auto-generated method stub
		return dao.update(cc);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Carreracampus> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Carreracampus> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
