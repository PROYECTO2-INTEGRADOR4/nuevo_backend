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
@Table(name = "carreras")
public class Carrera {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_carrera")
	@SequenceGenerator(name = "seq_carrera", sequenceName = "seq_carrera", allocationSize = 1)
	@Column(name = "id_carrera")
	private Long id;
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "carrera")
	@JsonIgnore
	private Set<Usuario> usuario;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "carrera")
	@JsonIgnore
	private Set<Carreraplan> carreraplan;
}
