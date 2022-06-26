package com.nttdata.proyectoJavaMicroservicios.service;

import com.nttdata.proyectoJavaMicroservicios.model.document.TransactionsType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionsTypeService {

    Flux<TransactionsType> findAll();
    Mono<TransactionsType> save(TransactionsType transactionsType);
    Mono<TransactionsType> findById(Long id);
    Mono<Boolean> existsById(Long id);
    Mono<Void> delete(Long id);
}
