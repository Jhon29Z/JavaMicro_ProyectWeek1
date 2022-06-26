package com.nttdata.proyectoJavaMicroservicios.service;

import com.nttdata.proyectoJavaMicroservicios.model.document.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {

    Flux<Client> findAll();
    Mono<Client> save(Client client);
    Mono<Client> findById(Long id);
    Mono<Boolean> existsById(Long id);
    Mono<Void> delete(Long id);

}
