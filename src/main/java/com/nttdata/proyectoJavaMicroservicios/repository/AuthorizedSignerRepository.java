package com.nttdata.proyectoJavaMicroservicios.repository;

import com.nttdata.proyectoJavaMicroservicios.model.document.AuthorizedSigner;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorizedSignerRepository extends ReactiveMongoRepository<AuthorizedSigner, Long> {
}
