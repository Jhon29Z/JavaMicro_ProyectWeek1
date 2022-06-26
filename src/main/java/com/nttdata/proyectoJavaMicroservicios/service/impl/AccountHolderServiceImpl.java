package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.AccountHolder;
import com.nttdata.proyectoJavaMicroservicios.repository.AccountHolderRepository;
import com.nttdata.proyectoJavaMicroservicios.service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountHolderServiceImpl implements AccountHolderService {

    @Autowired
    private AccountHolderRepository accountHolderRepository;

    @Override
    public Flux<AccountHolder> findAll() {
        return this.accountHolderRepository.findAll();
    }

    @Override
    public Mono<AccountHolder> save(AccountHolder accountHolder) {
        return this.accountHolderRepository.save(accountHolder);
    }

    @Override
    public Mono<AccountHolder> findById(Long id) {
        return this.accountHolderRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.accountHolderRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.accountHolderRepository.deleteById(id);
        return null;
    }
}
