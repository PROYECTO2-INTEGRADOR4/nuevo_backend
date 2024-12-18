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
@Table(name = "procesos")
public class Proceso {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_proceso")
	@SequenceGenerator(name = "seq_proceso", sequenceName = "seq_proceso", allocationSize = 1)
	@Column(name = "id_proceso")
	private Long id;
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "descripcion", length = 150)
	private String descripcion;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proceso")
	@JsonIgnore
	private Set<Procesorequisito> procesorequisito;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proceso")
	@JsonIgnore
	private Set<Detalleppp> detalleppp;
}
