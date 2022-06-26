package com.nttdata.proyectoJavaMicroservicios.repository;

import com.nttdata.proyectoJavaMicroservicios.model.document.CustomerType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypeRepository extends ReactiveMongoRepository<CustomerType, Long> {
}
