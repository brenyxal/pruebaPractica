package com.pruebaMs.patronFactory;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.pruebaMs.model.UsuarioDTO;


public interface Factory {

	public ResponseEntity<List<UsuarioDTO>> get(String tipo);
	 
}
