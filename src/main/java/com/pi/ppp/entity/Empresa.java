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
@Table(name = "empresas")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_empresa")
	@SequenceGenerator(name = "seq_empresa", sequenceName = "seq_empresa", allocationSize = 1)
	@Column(name = "id_empresa")
	private Long id;
	@Column(name = "razon_social", length = 150)
	private String razon_social;
	@Column(name = "direccion", length = 500)
	private String direccion;
	@Column(name = "ruc", length = 11)
	private char ruc;
	@Column(name = "telefono", length = 10)
	private char telefono;
	@Column(name = "sector", length = 50)
	private String sector;
	@Column(name = "pagina_web", length = 150)
	private String pagina_web;
	@Column(name = "correo_electronico", length = 100)
	private String correo_electronico;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empresa")
	@JsonIgnore
	private Set<Representante> representante;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empresa")
	@JsonIgnore
	private Set<Ppp> ppp;
}
