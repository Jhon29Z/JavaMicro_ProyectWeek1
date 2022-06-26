package com.nttdata.proyectoJavaMicroservicios.service;

import com.nttdata.proyectoJavaMicroservicios.model.document.CoinType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CoinTypeService {

    Flux<CoinType> findAll();
    Mono<CoinType> save(CoinType coinType);
    Mono<CoinType> findById(Long id);
    Mono<Boolean> existsById(Long id);
    Mono<Void> delete(Long id);
}
