package com.pi.ppp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Acceso;

@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long>{
	List<Acceso> findByAccesorol_RolNombre(String nombreRol);
}
