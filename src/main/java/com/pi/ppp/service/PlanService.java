package com.pi.ppp.service;

import java.util.List;
import java.util.Optional;

import com.pi.ppp.entity.Plan;

public interface PlanService {
	Plan create(Plan pl);
	Plan update(Plan pl);
	void delete(Long id);
	Optional<Plan> read(Long id);
	List<Plan> readAll();
}
