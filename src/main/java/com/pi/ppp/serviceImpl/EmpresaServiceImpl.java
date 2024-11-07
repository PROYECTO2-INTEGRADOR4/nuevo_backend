package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pi.ppp.entity.Empresa;
import com.pi.ppp.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService{

	@Override
	public Empresa create(Empresa em) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa update(Empresa em) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Empresa> read(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Empresa> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
