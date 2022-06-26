package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.TransactionsType;
import com.nttdata.proyectoJavaMicroservicios.repository.TransactionsTypeRepository;
import com.nttdata.proyectoJavaMicroservicios.service.TransactionsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionsTypeServiceImpl implements TransactionsTypeService {

    @Autowired
    private TransactionsTypeRepository transactionsTypeRepository;

    @Override
    public Flux<TransactionsType> findAll() {
        return this.transactionsTypeRepository.findAll();
    }

    @Override
    public Mono<TransactionsType> save(TransactionsType transactionsType) {
        return this.transactionsTypeRepository.save(transactionsType);
    }

    @Override
    public Mono<TransactionsType> findById(Long id) {
        return this.transactionsTypeRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.transactionsTypeRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.transactionsTypeRepository.deleteById(id);
        return null;
    }
}
