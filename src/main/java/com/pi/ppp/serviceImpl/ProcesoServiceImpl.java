package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pi.ppp.entity.Proceso;
import com.pi.ppp.service.ProcesoService;

@Service
public class ProcesoServiceImpl implements ProcesoService{

	@Override
	public Proceso create(Proceso po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proceso update(Proceso po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Proceso> read(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Proceso> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
