package com.nttdata.proyectoJavaMicroservicios.service;

import com.nttdata.proyectoJavaMicroservicios.model.document.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    Flux<Product> findAll();
    Mono<Product> save(Product product);
    Mono<Product> findById(Long id);
    Mono<Boolean> existsById(Long id);
    Mono<Void> delete(Long id);
}
