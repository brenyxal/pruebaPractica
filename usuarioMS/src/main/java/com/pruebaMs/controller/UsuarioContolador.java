package com.pruebaMs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaMs.model.UsuarioInterno;
import com.pruebaMs.service.UsuarioService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/v1/usuarioInterno")
public class UsuarioContolador {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioInterno>> get() {
		HttpStatus status = null;
		List<UsuarioInterno> usuarioInternoList = new ArrayList<>();
	    try {
	    	usuarioInternoList = usuarioService.findAll();
	    	if (usuarioInternoList.size()>0) {
	    		status = HttpStatus.OK;
	    	}else {
	    		status = HttpStatus.NO_CONTENT;
	    	}
		} catch (Exception e) {
		//	Log.error("Exception", e);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
	    return new ResponseEntity<List<UsuarioInterno>>(usuarioInternoList, status);
	}
	
	
	
}
