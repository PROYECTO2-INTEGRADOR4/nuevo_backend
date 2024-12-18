package com.pi.ppp.controller;

import lombok.AllArgsConstructor;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi.ppp.dto.AuthResponseDto;
import com.pi.ppp.dto.LoginDto;
import com.pi.ppp.entity.Rol;
import com.pi.ppp.service.AuthService;
import com.pi.ppp.service.UsuarioService;

@AllArgsConstructor
@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @Autowired
    private AuthService authService;
    
    @Autowired
    private UsuarioService usuarioService;

    // Build Login REST API
    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginDto loginDto){

        String token = authService.login(loginDto);
        
        var usuarioOpt = usuarioService.findByUsername(loginDto.getUsername());
        if (!usuarioOpt.isPresent()) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        var usuario = usuarioOpt.get();

        AuthResponseDto authResponseDto = new AuthResponseDto();
        authResponseDto.setAccessToken(token);
        authResponseDto.setUsername(usuario.getUsername());
        authResponseDto.setCarrera(usuario.getCarrera().getNombre());
        authResponseDto.setRoles(
        		usuario.getRoles().stream()
        		.map(Rol::getNombre)
        		.collect(Collectors.toList())
        );

        return new ResponseEntity<>(authResponseDto, HttpStatus.OK);
    }
}
