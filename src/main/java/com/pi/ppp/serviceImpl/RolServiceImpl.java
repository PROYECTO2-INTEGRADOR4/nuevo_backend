package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.RolDao;
import com.pi.ppp.entity.Rol;
import com.pi.ppp.service.RolService;

@Service
public class RolServiceImpl implements RolService{
	@Autowired
	private RolDao dao;
	
	@Override
	public Rol create(Rol ro) {
		// TODO Auto-generated method stub
		return dao.create(ro);
	}

	@Override
	public Rol update(Rol ro) {
		// TODO Auto-generated method stub
		return dao.update(ro);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
