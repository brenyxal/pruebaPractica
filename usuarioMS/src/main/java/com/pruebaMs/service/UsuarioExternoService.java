package com.pruebaMs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaMs.model.UsuarioExterno;
import com.pruebaMs.repository.UsuarioExternoRepository;



@Service
public class UsuarioExternoService {
	
	@Autowired
	private UsuarioExternoRepository usuarioExternoRepository;
	
	public List<UsuarioExterno> findAll(){
		return usuarioExternoRepository.findAll();		
	}
		
	public UsuarioExterno findById(String id) {
		UsuarioExterno usuarioExterno = null;
		 Optional<UsuarioExterno> result = usuarioExternoRepository.findById(id);
		 if(result.isPresent()) {
			 usuarioExterno = result.get();
		 }
		return usuarioExterno;
	}
	
	//public UsuarioInterno add(UsuarioInterno usuarioInterno) {
	//	String nombre = usuarioInterno.getNombre();
	//	 if(nombre !=null) {
	//		 usuarioInterno.setNombre(nombre.toUpperCase());
	//	 }
	//	return usuarioRepository.save(usuarioInterno);
	 //} 
	
	
	
	
	
	
}
