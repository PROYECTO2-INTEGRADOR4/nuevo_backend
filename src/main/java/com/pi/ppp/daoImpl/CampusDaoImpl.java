package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.CampusDao;
import com.pi.ppp.entity.Campus;
import com.pi.ppp.repository.CampusRepository;

@Component
public class CampusDaoImpl implements CampusDao{
	@Autowired
	private CampusRepository repository;
	
	@Override
	public Campus create(Campus cm) {
		// TODO Auto-generated method stub
		return repository.save(cm);
	}

	@Override
	public Campus update(Campus cm) {
		// TODO Auto-generated method stub
		return repository.save(cm);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Campus> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Campus> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
