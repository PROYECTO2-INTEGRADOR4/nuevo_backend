package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Detalledocumento;

@Repository
public interface DetalledocumentoRepository extends JpaRepository<Detalledocumento, Long>{

}
