package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Proceso;

@Repository
public interface ProcesoRepository extends JpaRepository<Proceso, Long>{

}
