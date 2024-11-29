package com.pi.ppp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EstudianteDto {
	private String nombres;
	private String apellidos;
	private String email;
	private String carrera;
	private String dni;
	private String telefono;
	private String plan;
	private String codigo;
	private String correo_institucional;
}
