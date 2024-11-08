package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.CampusDao;
import com.pi.ppp.entity.Campus;
import com.pi.ppp.service.CampusService;

@Service
public class CampusServiceImpl implements CampusService{
	@Autowired
	private CampusDao dao;
	
	@Override
	public Campus create(Campus cm) {
		// TODO Auto-generated method stub
		return dao.create(cm);
	}

	@Override
	public Campus update(Campus cm) {
		// TODO Auto-generated method stub
		return dao.update(cm);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Campus> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Campus> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
