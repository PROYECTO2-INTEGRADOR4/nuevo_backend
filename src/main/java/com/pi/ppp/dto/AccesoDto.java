package com.pi.ppp.dto;

import java.util.ArrayList;
import java.util.List;

import com.pi.ppp.entity.Acceso;

import lombok.Data;

@Data
public class AccesoDto {
	private Long id;
	private String titulo;
	private String url;
	private String icono;
	private Long padre;
	private List<AccesoDto> subaccesos = new ArrayList<>();
    
	public AccesoDto(Acceso acceso) {
		this.id = acceso.getId();
		this.titulo = acceso.getTitulo();
		this.url = acceso.getUrl();
		this.icono = acceso.getIcono();
		this.padre = (acceso.getPadre() != null) ? acceso.getPadre().getId() : null;
		this.subaccesos = new ArrayList<>();
	}
}
