package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.ProcesoDao;
import com.pi.ppp.entity.Proceso;
import com.pi.ppp.service.ProcesoService;

@Service
public class ProcesoServiceImpl implements ProcesoService{
	@Autowired
	private ProcesoDao dao;
	
	@Override
	public Proceso create(Proceso po) {
		// TODO Auto-generated method stub
		return dao.create(po);
	}

	@Override
	public Proceso update(Proceso po) {
		// TODO Auto-generated method stub
		return dao.update(po);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Proceso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Proceso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
