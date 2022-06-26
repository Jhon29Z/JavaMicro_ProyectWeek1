package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.Product;
import com.nttdata.proyectoJavaMicroservicios.repository.ProductRepository;
import com.nttdata.proyectoJavaMicroservicios.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Flux<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Mono<Product> save(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Mono<Product> findById(Long id) {
        return this.productRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.productRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.productRepository.deleteById(id);
        return null;
    }
}
