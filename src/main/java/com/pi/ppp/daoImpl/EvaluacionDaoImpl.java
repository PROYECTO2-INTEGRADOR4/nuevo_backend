package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.EvaluacionDao;
import com.pi.ppp.entity.Evaluacion;
import com.pi.ppp.repository.EvaluacionRepository;

@Component
public class EvaluacionDaoImpl implements EvaluacionDao{
	@Autowired
	private EvaluacionRepository repository;
	
	@Override
	public Evaluacion create(Evaluacion ev) {
		// TODO Auto-generated method stub
		return repository.save(ev);
	}

	@Override
	public Evaluacion update(Evaluacion ev) {
		// TODO Auto-generated method stub
		return repository.save(ev);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Evaluacion> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Evaluacion> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
