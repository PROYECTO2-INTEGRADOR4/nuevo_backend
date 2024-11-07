package com.pi.ppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Campus;

@Repository
public interface CampusRepository extends JpaRepository<Campus, Long>{

}