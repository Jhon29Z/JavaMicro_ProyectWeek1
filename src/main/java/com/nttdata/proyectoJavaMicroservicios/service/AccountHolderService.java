package com.nttdata.proyectoJavaMicroservicios.service;

import com.nttdata.proyectoJavaMicroservicios.model.document.AccountHolder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountHolderService {

    Flux<AccountHolder> findAll();
    Mono<AccountHolder> save(AccountHolder accountHolder);
    Mono<AccountHolder> findById(Long id);
    Mono<Boolean> existsById(Long id);
    Mono<Void> delete(Long id);
}
