package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.EmpresaDao;
import com.pi.ppp.entity.Empresa;
import com.pi.ppp.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService{
	@Autowired
	private EmpresaDao dao;
	
	@Override
	public Empresa create(Empresa em) {
		// TODO Auto-generated method stub
		return dao.create(em);
	}

	@Override
	public Empresa update(Empresa em) {
		// TODO Auto-generated method stub
		return dao.update(em);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Empresa> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Empresa> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
