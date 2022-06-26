package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.Transaction;
import com.nttdata.proyectoJavaMicroservicios.repository.TransactionRepository;
import com.nttdata.proyectoJavaMicroservicios.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Flux<Transaction> findAll() {
        return this.transactionRepository.findAll();
    }

    @Override
    public Mono<Transaction> save(Transaction transaction) {
        return this.transactionRepository.save(transaction);
    }

    @Override
    public Mono<Transaction> findById(Long id) {
        return this.transactionRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.transactionRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.transactionRepository.deleteById(id);
        return null;
    }
}
