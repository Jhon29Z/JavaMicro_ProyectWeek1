package com.nttdata.proyectoJavaMicroservicios.service;

import com.nttdata.proyectoJavaMicroservicios.model.document.AuthorizedSigner;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AuthorizedSignerService {

    Flux<AuthorizedSigner> findAll();
    Mono<AuthorizedSigner> save(AuthorizedSigner authorizedSigner);
    Mono<AuthorizedSigner> findById(Long id);
    Mono<Boolean> existsById(Long id);
    Mono<Void> delete(Long id);
}
