package com.pi.ppp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "rubros")
public class Rubro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rubro")
	private Long id;
	@Column(name = "peso")
	private int peso;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@ManyToOne
	@JoinColumn(name = "id_criterio", nullable = false)
	private Criterio criterio;
	
	@ManyToOne
	@JoinColumn(name = "id_carreraplan", nullable = false)
	private Carreraplan carreraplan;
}
