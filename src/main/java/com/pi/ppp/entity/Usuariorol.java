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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Data
@Getter
@Entity
@Table(name = "usuario_rol")
public class Usuariorol {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuariorol")
	@SequenceGenerator(name = "seq_usuariorol", sequenceName = "seq_usuariorol", allocationSize = 1)
	@Column(name = "id_usuariorol")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_rol", nullable = false)
	private Rol rol;
	
}
