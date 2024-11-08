package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.RubroDao;
import com.pi.ppp.entity.Rubro;
import com.pi.ppp.service.RubroService;

@Service
public class RubroServiceImpl implements RubroService{
	@Autowired
	private RubroDao dao;
	
	@Override
	public Rubro create(Rubro ru) {
		// TODO Auto-generated method stub
		return dao.create(ru);
	}

	@Override
	public Rubro update(Rubro ru) {
		// TODO Auto-generated method stub
		return dao.update(ru);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Rubro> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Rubro> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
