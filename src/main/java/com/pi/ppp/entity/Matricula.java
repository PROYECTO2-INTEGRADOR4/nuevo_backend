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
@Table(name = "matriculas")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_matricula")
	private Long id;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_matricula")
	private Date fecha_matricula;
	@Column(name = "monto_matricula")
	private int monto_matricula;
	@Column(name = "creditos_matriculados")
	private int creditos_matriculados;
	@Column(name = "estado")
	private char estado;
	
	@ManyToOne
	@JoinColumn(name = "id_carreraplan", nullable = false)
	private Carreraplan carreraplan;
	
	@ManyToOne
	@JoinColumn(name = "id_estudiante", nullable = false)
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name = "id_campus", nullable = false)
	private Campus campus;
	
	 @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "matricula")
	 @JsonIgnore
	 private Set<Ppp> ppp;
}
