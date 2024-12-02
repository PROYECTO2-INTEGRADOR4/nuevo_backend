package com.pi.ppp.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pi.ppp.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	 Optional<Usuario> findByUsername(String username);
	 
	 @Query("SELECT u.carrera.nombre AS carrera, COUNT(u) AS total " +
	        "FROM Usuario u " +
	        "GROUP BY u.carrera.nombre")
	 List<Map<String, Object>> contarUsuariosPorCarrera();
	 
	 @Query(value = "SELECT m.id_matricula FROM Usuarios u " +
	           "JOIN Personas p ON u.id_usuario = p.id_persona " +
	           "JOIN Estudiantes e ON p.id_persona = e.id_estudiante " +
	           "JOIN Matriculas m ON e.id_estudiante = m.id_matricula " +
	           "WHERE u.username = :username",
	           nativeQuery = true)
	 Long obtenerIdMatriculaPorUsername(@Param("username") String username);
}
