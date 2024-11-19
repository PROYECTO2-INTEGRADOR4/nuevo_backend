package com.pi.ppp.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "detalle_documento")
public class Detalledocumento {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_detalledocumento")
	@SequenceGenerator(name = "seq_detalledocumento", sequenceName = "seq_detalledocumento", allocationSize = 1)
	@Column(name = "id_detalledocumento")
	private Long id;
	@Column(name = "archivo", length = 50)
	private String archivo;
	@Column(name = "direccion_archivo", length = 150)
	private String direccion_archivo;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@ManyToOne
	@JoinColumn(name = "id_detalleppp", nullable = false)
	private Detalleppp detalleppp;
}
