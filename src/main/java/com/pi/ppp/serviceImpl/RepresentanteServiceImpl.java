package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.RepresentanteDao;
import com.pi.ppp.entity.Representante;
import com.pi.ppp.service.RepresentanteService;

@Service
public class RepresentanteServiceImpl implements RepresentanteService{
	@Autowired
	private RepresentanteDao dao;
	
	@Override
	public Representante create(Representante rp) {
		// TODO Auto-generated method stub
		return dao.create(rp);
	}

	@Override
	public Representante update(Representante rp) {
		// TODO Auto-generated method stub
		return dao.update(rp);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Representante> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Representante> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
