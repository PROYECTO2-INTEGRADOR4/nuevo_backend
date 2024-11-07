package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Accesorol;

@Repository
public interface AccesorolRepository extends JpaRepository<Accesorol, Long>{

}
