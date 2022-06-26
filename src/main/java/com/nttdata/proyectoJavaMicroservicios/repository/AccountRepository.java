package com.nttdata.proyectoJavaMicroservicios.repository;

import com.nttdata.proyectoJavaMicroservicios.model.document.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ReactiveMongoRepository<Account, Long> {
}
