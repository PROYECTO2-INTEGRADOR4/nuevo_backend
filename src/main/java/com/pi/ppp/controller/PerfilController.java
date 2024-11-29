package com.pi.ppp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi.ppp.dto.PerfilDto;
import com.pi.ppp.serviceImpl.PerfilServiceImpl;

@RestController
@RequestMapping("/perfil")
@CrossOrigin(origins = "http://localhost:4200")
public class PerfilController {
	
	@Autowired
	private PerfilServiceImpl serviceImpl;
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN') or hasRole('SUPERVISOR')")
	@GetMapping("/{username}")
    public PerfilDto obtenerPerfil(@PathVariable String username) {
        return serviceImpl.obtenerPerfil(username);
    }

}
