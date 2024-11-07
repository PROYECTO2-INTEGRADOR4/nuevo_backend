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
@Table(name = "ppp")
public class Ppp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
