package com.pruebaMs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaMs.model.UsuarioInterno;
import com.pruebaMs.repository.UsuarioRepository;



@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioInterno> findAll(){
		return usuarioRepository.findAll();		
	}
		
	public UsuarioInterno findById(String id) {
		UsuarioInterno usuarioInterno = null;
		 Optional<UsuarioInterno> result = usuarioRepository.findById(id);
		 if(result.isPresent()) {
			 usuarioInterno = result.get();
		 }
		return usuarioInterno;
	}
	
	//public UsuarioInterno add(UsuarioInterno usuarioInterno) {
	//	String nombre = usuarioInterno.getNombre();
	//	 if(nombre !=null) {
	//		 usuarioInterno.setNombre(nombre.toUpperCase());
	//	 }
	//	return usuarioRepository.save(usuarioInterno);
	 //} 
	
	
	
	
	
	
}
