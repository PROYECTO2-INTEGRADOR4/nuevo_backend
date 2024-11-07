package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Representante;

@Repository
public interface RepresentanteRepository extends JpaRepository<Representante, Long>{

}
