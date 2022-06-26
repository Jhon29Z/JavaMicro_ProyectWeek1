package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.CustomerType;
import com.nttdata.proyectoJavaMicroservicios.repository.CustomerTypeRepository;
import com.nttdata.proyectoJavaMicroservicios.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public Flux<CustomerType> findAll() {
        return this.customerTypeRepository.findAll();
    }

    @Override
    public Mono<CustomerType> save(CustomerType customerType) {
        return this.customerTypeRepository.save(customerType);
    }

    @Override
    public Mono<CustomerType> findById(Long id) {
        return this.customerTypeRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.customerTypeRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.customerTypeRepository.deleteById(id);
        return null;
    }
}
