package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.RequisitoDao;
import com.pi.ppp.entity.Requisito;
import com.pi.ppp.service.RequisitoService;

@Service
public class RequisitoServiceImpl implements RequisitoService{
	@Autowired
	private RequisitoDao dao;
	
	@Override
	public Requisito create(Requisito re) {
		// TODO Auto-generated method stub
		return dao.create(re);
	}

	@Override
	public Requisito update(Requisito re) {
		// TODO Auto-generated method stub
		return dao.update(re);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Requisito> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Requisito> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
