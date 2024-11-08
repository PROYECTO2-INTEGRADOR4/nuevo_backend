package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.ProcesoDao;
import com.pi.ppp.entity.Proceso;
import com.pi.ppp.repository.ProcesoRepository;

@Component
public class ProcesoDaoImpl implements ProcesoDao{
	@Autowired
	private ProcesoRepository repository;
	
	@Override
	public Proceso create(Proceso po) {
		// TODO Auto-generated method stub
		return repository.save(po);
	}

	@Override
	public Proceso update(Proceso po) {
		// TODO Auto-generated method stub
		return repository.save(po);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Proceso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Proceso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
