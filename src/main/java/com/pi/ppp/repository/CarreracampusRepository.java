package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Carreracampus;

@Repository
public interface CarreracampusRepository extends JpaRepository<Carreracampus, Long>{

}