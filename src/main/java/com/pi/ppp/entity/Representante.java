package com.pi.ppp.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Table(name = "representantes")
public class Representante {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_representante")
	@SequenceGenerator(name = "seq_representante", sequenceName = "seq_representante", allocationSize = 1)
	@Column(name = "id_representante")
	private Long id;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresa empresa;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id_persona")
	 private Persona persona;
}
