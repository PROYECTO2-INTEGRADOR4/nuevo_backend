package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Criterio;

@Repository
public interface CriterioRepository extends JpaRepository<Criterio, Long>{

}
