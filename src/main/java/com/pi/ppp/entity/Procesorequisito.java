package com.pi.ppp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "proceso_requisito")
public class Procesorequisito {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_procesorequisito")
	@SequenceGenerator(name = "seq_procesorequisito", sequenceName = "seq_procesorequisito", allocationSize = 1)
	@Column(name = "id_procesorequsito")
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
	@JoinColumn(name = "id_carreraplan", nullable = false)
	private Carreraplan carreraplan;
}
