package com.pi.ppp.dto;

import java.util.List;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String accessToken;
    private String username;
    private String carrera;
    private List<String> roles;
    
    public void setCarrera(String carrera) {
    	this.carrera = carrera;
    }
    
    public void setRoles(List<String> roles) {
    	this.roles = roles;
    }
}
