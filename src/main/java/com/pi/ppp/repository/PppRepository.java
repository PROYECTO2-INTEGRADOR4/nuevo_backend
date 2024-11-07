package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Ppp;

@Repository
public interface PppRepository extends JpaRepository<Ppp, Long>{

}
