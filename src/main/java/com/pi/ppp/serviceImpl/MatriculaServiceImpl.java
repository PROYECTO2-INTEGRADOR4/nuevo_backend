package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.MatriculaDao;
import com.pi.ppp.entity.Matricula;
import com.pi.ppp.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService{
	@Autowired
	private MatriculaDao dao;
	
	@Override
	public Matricula create(Matricula ma) {
		// TODO Auto-generated method stub
		return dao.create(ma);
	}

	@Override
	public Matricula update(Matricula ma) {
		// TODO Auto-generated method stub
		return dao.update(ma);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
