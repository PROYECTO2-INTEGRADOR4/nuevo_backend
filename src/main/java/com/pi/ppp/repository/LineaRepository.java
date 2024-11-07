package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Linea;

@Repository
public interface LineaRepository extends JpaRepository<Linea, Long>{

}
