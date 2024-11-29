package com.pi.ppp.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	 Optional<Usuario> findByUsername(String username);
	 
	 @Query("SELECT u.carrera.nombre AS carrera, COUNT(u) AS total " +
	        "FROM Usuario u " +
	        "GROUP BY u.carrera.nombre")
	 List<Map<String, Object>> contarUsuariosPorCarrera();
}
