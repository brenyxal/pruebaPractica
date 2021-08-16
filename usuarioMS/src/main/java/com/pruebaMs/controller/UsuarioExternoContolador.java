package com.pruebaMs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaMs.model.UsuarioDTO;
import com.pruebaMs.model.UsuarioExterno;
import com.pruebaMs.patronFactory.Factory;
import com.pruebaMs.service.UsuarioExternoService;
import com.pruebaMs.service.UsuarioService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/v1/usuarioExterno")
public class UsuarioExternoContolador implements Factory {

	@Autowired
	private UsuarioExternoService usuarioExternoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> get(String tipo) {
		HttpStatus status = null;
		List<UsuarioDTO> usuarioDTOList = new ArrayList<>();
		
	    try {
	    	if(tipo=="2")
	    		usuarioDTOList = usuarioExternoService.findAll();
    		else
    			usuarioDTOList = usuarioService.findAll();
	    	if (usuarioDTOList.size()>0) {
	    		status = HttpStatus.OK;
	    		
	    	}else {
	    		status = HttpStatus.NO_CONTENT;
	    		    		
	    	}
		} catch (Exception e) {
		//	Log.error("Exception", e);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
	    return new ResponseEntity<List<UsuarioDTO>>(usuarioDTOList, status);
	}

	
	
	
	
	
}
