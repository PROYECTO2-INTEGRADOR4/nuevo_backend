package com.pi.ppp.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pi.ppp.dto.EstudianteDto;
import com.pi.ppp.entity.Carreraplan;
import com.pi.ppp.entity.Usuario;
import com.pi.ppp.repository.UsuarioRepository;

public class EstudianteDtoImpl {
	
	@Autowired
	private UsuarioRepository repository;
	
	public EstudianteDto obtenerDatosEstudiante(String username) {
		Usuario usuario = repository.findByUsername(username)
				.orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
		
		EstudianteDto esDto = new EstudianteDto();
		esDto.setNombres(usuario.getPersona().getNombres());
		esDto.setApellidos(usuario.getPersona().getApellidos());
		esDto.setEmail(usuario.getEmail());
		esDto.setCarrera(usuario.getCarrera().getNombre());
		esDto.setDni(usuario.getPersona().getDni());
		esDto.setTelefono(usuario.getPersona().getTelefono());
		String plan = null;
        String correo_institucional = null;
        String codigo = null;
        if (usuario.getPersona() != null) {
            correo_institucional = usuario.getPersona().getEstudiante().getCorreo_institucional();
           
        }
        if (usuario.getCarrera() != null && usuario.getCarrera().getCarreraplan() != null) {
            // Obtener el primer plan (si existe)
            Optional<Carreraplan> optionalPlan = usuario.getCarrera().getCarreraplan().stream().findFirst();
            
        }
        esDto.setPlan(plan);
       

        return esDto;
        
	}	

}
