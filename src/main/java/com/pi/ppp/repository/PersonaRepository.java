package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
