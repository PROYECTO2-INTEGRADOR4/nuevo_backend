package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long>{

}
