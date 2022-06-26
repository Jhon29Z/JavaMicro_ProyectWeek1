package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.ProductType;
import com.nttdata.proyectoJavaMicroservicios.repository.ProductTypeRepository;
import com.nttdata.proyectoJavaMicroservicios.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductTypeServiceImpl implements ProductTypeService{

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public Flux<ProductType> findAll() {
        return this.productTypeRepository.findAll();
    }

    @Override
    public Mono<ProductType> save(ProductType productType) {
        return this.productTypeRepository.save(productType);
    }

    @Override
    public Mono<ProductType> findById(Long id) {
        return this.productTypeRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.productTypeRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.productTypeRepository.deleteById(id);
        return null;
    }
}
