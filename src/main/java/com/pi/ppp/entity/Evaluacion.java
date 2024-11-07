package com.pi.ppp.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "evaluaciones")
public class Evaluacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evaluacion")
	private Long id;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "nota")
	private int nota;
	@Column(name = "ESTAO", length = 1)
	private char estado;
}
