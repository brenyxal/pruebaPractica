package com.pruebaMs.model;



import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class UsuarioInterno {
	
	@Id
	private String id;
	
	private String ci;
	
	private String nombre;
	
	private String apellido;
	
	private String cargo;
	
	private String usuario;
	
	private String password;
		

}
