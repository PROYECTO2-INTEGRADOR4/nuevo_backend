package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.ProcesorequisitoDao;
import com.pi.ppp.entity.Procesorequisito;
import com.pi.ppp.service.ProcesorequisitoService;

@Service
public class ProcesorequisitoServiceImpl implements ProcesorequisitoService{
	@Autowired
	private ProcesorequisitoDao dao;
	
	@Override
	public Procesorequisito create(Procesorequisito pr) {
		// TODO Auto-generated method stub
		return dao.create(pr);
	}

	@Override
	public Procesorequisito update(Procesorequisito pr) {
		// TODO Auto-generated method stub
		return dao.update(pr);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Procesorequisito> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Procesorequisito> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
