package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
