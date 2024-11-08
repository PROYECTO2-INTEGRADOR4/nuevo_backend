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
@Table(name = "campus")
public class Campus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_campus")
	private Long id;
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "direccion", length = 100)
	private String direccion;
	@Column(name = "pagina_web", length = 200)
	private String pagina_web;
	@Column(name = "telefono", length = 15)
	private String telefono;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "campus")
	@JsonIgnore
	private Set<Carreracampus> carreracampus;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "campus")
	@JsonIgnore
	private Set<Matricula> matricula;
}
