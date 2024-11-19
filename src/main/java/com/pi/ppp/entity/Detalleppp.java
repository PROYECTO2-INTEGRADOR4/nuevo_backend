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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "detalle_ppp")
public class Detalleppp {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_detalleppp")
	@SequenceGenerator(name = "seq_detalleppp", sequenceName = "seq_detalleppp", allocationSize = 1)
	@Column(name = "id_detalleppp")
	private Long id;
	@Column(name = "requisito_orden")
	private int requisito_orden;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@ManyToOne
	@JoinColumn(name = "id_rol", nullable = false)
	private Rol rol;
	
	@ManyToOne
	@JoinColumn(name = "id_proceso", nullable = false)
	private Proceso proceso;
	
	@ManyToOne
	@JoinColumn(name = "id_requisito", nullable = false)
	private Requisito requisito;
	
	@ManyToOne
	@JoinColumn(name = "id_persona", nullable = false)
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name = "id_ppp", nullable = false)
	private Ppp ppp;
	
	@ManyToOne
	@JoinColumn(name = "id_estado", nullable = false)
	private Estado estado2;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "detalleppp")
	@JsonIgnore
	private Set<Detalledocumento> detalledocumento;
}
