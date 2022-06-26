package com.nttdata.proyectoJavaMicroservicios.service;


import com.nttdata.proyectoJavaMicroservicios.model.document.CustomerType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerTypeService {

    Flux<CustomerType> findAll();
    Mono<CustomerType> save(CustomerType customerType);
    Mono<CustomerType> findById(Long id);
    Mono<Boolean> existsById(Long id);
    Mono<Void> delete(Long id);
}
