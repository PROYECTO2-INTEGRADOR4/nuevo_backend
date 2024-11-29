package com.pi.ppp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PerfilDto {
	private String apellidos;
    private String nombres;
    private String  dni;
    private String telefono;
    private String carrera;
    private String email;
   
}
