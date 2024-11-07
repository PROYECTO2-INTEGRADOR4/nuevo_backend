package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Procesorequisito;

@Repository
public interface ProcesorequisitoRepository extends JpaRepository<Procesorequisito, Long>{

}
