package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.DetalledocumentoDao;
import com.pi.ppp.entity.Detalledocumento;
import com.pi.ppp.repository.DetalledocumentoRepository;

@Component
public class DetalledocumentoDaoImpl implements DetalledocumentoDao{
	@Autowired
	private DetalledocumentoRepository repository;
	
	@Override
	public Detalledocumento create(Detalledocumento dd) {
		// TODO Auto-generated method stub
		return repository.save(dd);
	}

	@Override
	public Detalledocumento update(Detalledocumento dd) {
		// TODO Auto-generated method stub
		return repository.save(dd);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Detalledocumento> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Detalledocumento> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
