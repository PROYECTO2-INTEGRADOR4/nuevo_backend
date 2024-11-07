package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Actividad;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, Long>{

}
