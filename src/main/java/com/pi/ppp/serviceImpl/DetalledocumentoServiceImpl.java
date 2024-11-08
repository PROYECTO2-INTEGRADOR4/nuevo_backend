package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.DetalledocumentoDao;
import com.pi.ppp.entity.Detalledocumento;
import com.pi.ppp.service.DetalledocumentoService;

@Service
public class DetalledocumentoServiceImpl implements DetalledocumentoService{
	@Autowired
	private DetalledocumentoDao dao;
	
	@Override
	public Detalledocumento create(Detalledocumento dd) {
		// TODO Auto-generated method stub
		return dao.create(dd);
	}

	@Override
	public Detalledocumento update(Detalledocumento dd) {
		// TODO Auto-generated method stub
		return dao.update(dd);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Detalledocumento> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Detalledocumento> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
