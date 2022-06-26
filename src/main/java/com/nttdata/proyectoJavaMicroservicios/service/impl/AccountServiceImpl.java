package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.Account;
import com.nttdata.proyectoJavaMicroservicios.repository.AccountRepository;
import com.nttdata.proyectoJavaMicroservicios.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Flux<Account> findAll() {
        return this.accountRepository.findAll();
    }

    @Override
    public Mono<Account> save(Account account) {
        return this.accountRepository.save(account);
    }

    @Override
    public Mono<Account> findById(Long id) {
        return this.accountRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.accountRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.accountRepository.deleteById(id);
        return null;
    }
}
