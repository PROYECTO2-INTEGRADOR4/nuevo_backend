package com.pi.ppp.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_persona")
	@SequenceGenerator(name = "seq_persona", sequenceName = "seq_persona", allocationSize = 1)
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
	
	 @OneToOne(mappedBy = "persona")
	 private Usuario usuario;
	 
	 @OneToOne(mappedBy = "persona")
	 private Estudiante estudiante;
	 
	 @OneToOne(mappedBy = "persona")
	 private Representante representante;
	 
	 @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "persona")
	 @JsonIgnore
	 private Set<Detalleppp> detalleppp;
}
