package com.pruebaMs.model;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class UsuarioDTO {

	@Id
	private String id;
	
	private String ci;
	
	private String nombre;
	
	private String apellido;
	
	private String edad;
	
	private String direccion;
	
	private String telefono;
	
	private String cargo;
	
	private String usuario;
	
	private String password;
}
