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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1)
	@Column(name = "id_usuario")
	private Long id;
	@Column(name = "username", length = 50)
	private String username;
	@Column(name = "email", length = 200)
    private String email;
	@Column(name = "password", length = 200)
	private String password;
	@Column(name = "estado", length = 1)
	private char estado;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usuario")
	@JsonIgnore
	private Set<Usuariorol> usuariorol;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id_persona")
	 private Persona persona;
}
