package com.pi.ppp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.ppp.dto.PerfilDto;
import com.pi.ppp.entity.Usuario;
import com.pi.ppp.repository.UsuarioRepository;

@Service
public class PerfilServiceImpl{

	@Autowired
	private UsuarioRepository usuarioRepository;

    public PerfilDto obtenerPerfil(String username) {
        
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        PerfilDto perfil = new PerfilDto();
        perfil.setNombres(usuario.getPersona().getNombres());
        perfil.setApellidos(usuario.getPersona().getApellidos());
        perfil.setDni(usuario.getPersona().getDni());
        perfil.setTelefono(usuario.getPersona().getTelefono());
        perfil.setCarrera(usuario.getCarrera().getNombre());
        perfil.setEmail(usuario.getEmail());
        
        return perfil;
    }

}
