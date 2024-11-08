package com.pi.ppp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dao.PlanDao;
import com.pi.ppp.entity.Plan;
import com.pi.ppp.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService{
	@Autowired
	private PlanDao dao;
	
	@Override
	public Plan create(Plan pl) {
		// TODO Auto-generated method stub
		return dao.create(pl);
	}

	@Override
	public Plan update(Plan pl) {
		// TODO Auto-generated method stub
		return dao.update(pl);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Plan> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
