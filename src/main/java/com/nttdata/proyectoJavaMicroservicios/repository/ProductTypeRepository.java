package com.nttdata.proyectoJavaMicroservicios.repository;

import com.nttdata.proyectoJavaMicroservicios.model.document.ProductType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends ReactiveMongoRepository<ProductType, Long> {
}
