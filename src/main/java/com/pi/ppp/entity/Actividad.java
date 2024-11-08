package com.pi.ppp.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "actividades")
public class Actividad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_actividad")
	private Long id;
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "descripcion", length = 250)
	private String descripcion;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_actividad")
	private Date fecha_actividad;
	@Column(name = "duracion", length = 50)
	private String duracion;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@ManyToOne
	@JoinColumn(name = "id_estado", nullable = false)
	private Estado estado2;
	
	@ManyToOne
	@JoinColumn(name = "id_ppp", nullable = false)
	private Ppp ppp;
}
