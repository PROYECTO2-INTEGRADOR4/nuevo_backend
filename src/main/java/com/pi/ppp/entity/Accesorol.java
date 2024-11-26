
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
@Table(name = "accesos_rol")
public class Accesorol {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_accesorol")
	@SequenceGenerator(name = "seq_accesorol", sequenceName = "seq_accesorol", allocationSize = 1)
	@Column(name = "id_accesorol")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_acceso", nullable = false)
	private Acceso acceso;
	
	@ManyToOne
	@JoinColumn(name = "id_rol", nullable = false)
	private Rol rol;
}
