package com.pi.ppp.dto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String accessToken;
    private String username;
    private String carrera;
    private String rol;
    
    public void setCarrera(String carrera) {
    	this.carrera = carrera;
    }
}
