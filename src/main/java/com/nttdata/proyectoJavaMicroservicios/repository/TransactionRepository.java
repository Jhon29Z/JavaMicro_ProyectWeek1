package com.nttdata.proyectoJavaMicroservicios.repository;

import com.nttdata.proyectoJavaMicroservicios.model.document.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends ReactiveMongoRepository<Transaction, Long> {
}
