package com.pi.ppp.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pi.ppp.dao.PlanDao;
import com.pi.ppp.entity.Plan;
import com.pi.ppp.repository.PlanRepository;

@Component
public class PlanDaoImpl implements PlanDao{
	@Autowired
	private PlanRepository repository;
	
	@Override
	public Plan create(Plan pl) {
		// TODO Auto-generated method stub
		return repository.save(pl);
	}

	@Override
	public Plan update(Plan pl) {
		// TODO Auto-generated method stub
		return repository.save(pl);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Plan> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
