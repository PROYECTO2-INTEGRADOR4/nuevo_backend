package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Evaluacion;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long>{

}
