package com.pruebaMs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pruebaMs.model.UsuarioInterno;

public interface UsuarioRepository extends MongoRepository<UsuarioInterno, String>{
	
}
 