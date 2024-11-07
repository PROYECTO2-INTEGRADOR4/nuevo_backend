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
@Table(name = "personas")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Long id;
	@Column(name = "nombres", length = 50)
	private String nombres;
	@Column(name = "apellidos", length = 50)
	private String apellidos;
	@Column(name = "dni", length = 8)
	private char dni;
	@Column(name = "telefono", length = 9)
	private char telefono;
	@Column(name = "estado", length = 1)
	private char estado;
}
