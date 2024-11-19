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
@Table(name = "accesos")
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acceso")
	@SequenceGenerator(name = "seq_acceso", sequenceName = "seq_acceso", allocationSize = 1)
	@Column(name = "id_acceso")
	private Long id;
	@Column(name = "titulo", length = 50)
	private String titulo;
	@Column(name = "icono", length = 150)
	private String icono;
	@Column(name = "url", length = 150)
	private String url;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "acceso")
	@JsonIgnore
	private Set<Accesorol> accesorol;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_accesop")
	private Acceso padre;

	@OneToMany(mappedBy = "padre", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Acceso> subacceso;
}
