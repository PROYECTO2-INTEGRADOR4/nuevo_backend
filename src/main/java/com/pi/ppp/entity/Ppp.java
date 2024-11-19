package com.pi.ppp.entity;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "ppp")
public class Ppp {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ppp")
	@SequenceGenerator(name = "seq_ppp", sequenceName = "seq_ppp", allocationSize = 1)
	@Column(name = "id_ppp")
	private Long id;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio")
	private Date fecha_inicio;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin")
	private Date fecha_fin;
	@Column(name = "hora_ingreso", length = 10)
	private String hora_ingreso;
	@Column(name = "hora_salida", length = 10)
	private String hora_salida;
	@Column(name = "horas_trabajadas")
	private int horas_trabajadas;
	@Column(name = "promedio")
	private int promedio;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@ManyToOne
	@JoinColumn(name = "id_linea", nullable = false)
	private Linea linea;
	
	@ManyToOne
	@JoinColumn(name = "id_matricula", nullable = false)
	private Matricula matricula;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name = "id_estado", nullable = false)
	private Estado estado2;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ppp")
	@JsonIgnore
	private Set<Evaluacion> evaluacion;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ppp")
	@JsonIgnore
	private Set<Actividad> actividad;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ppp")
	@JsonIgnore
	private Set<Detalleppp> detalleppp;
}
