package com.pruebaMs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.pruebaMs.model.UsuarioExterno;


public interface UsuarioExternoRepository extends MongoRepository<UsuarioExterno, String>{
	
}
 