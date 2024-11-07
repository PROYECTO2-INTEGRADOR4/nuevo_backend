package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Detalleppp;

@Repository
public interface DetallepppRepository extends JpaRepository<Detalleppp, Long>{

}
