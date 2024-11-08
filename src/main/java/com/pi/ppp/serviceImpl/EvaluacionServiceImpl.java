package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.EvaluacionDao;
import com.pi.ppp.entity.Evaluacion;
import com.pi.ppp.service.EvaluacionService;

@Service
public class EvaluacionServiceImpl implements EvaluacionService{
	@Autowired
	private EvaluacionDao dao;
	
	@Override
	public Evaluacion create(Evaluacion ev) {
		// TODO Auto-generated method stub
		return dao.create(ev);
	}

	@Override
	public Evaluacion update(Evaluacion ev) {
		// TODO Auto-generated method stub
		return dao.update(ev);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Evaluacion> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Evaluacion> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
