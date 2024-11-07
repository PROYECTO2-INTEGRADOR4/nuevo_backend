package com.pi.ppp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "accesos")
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acceso")
	private Long id;
	@Column(name = "titulo", length = 50)
	private String titulo;
	@Column(name = "icono", length = 150)
	private String icono;
	@Column(name = "estado", length = 1)
	private char estado;
	@Column(name = "url", length = 150)
	private String url;
}
