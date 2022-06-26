package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.Account;
import com.nttdata.proyectoJavaMicroservicios.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "accounts")
public class AccountApi {

    @Autowired
    private AccountService accountService;

    @GetMapping
    Flux<Account> findAll(){
        return accountService.findAll();
    }

    @PostMapping
    Mono<Account> create(@RequestBody Account account){
        return accountService.save(account);
    }

    @PutMapping
    Mono<Account> update(@RequestBody Account account){
        return accountService.save(account);
    }

    @GetMapping("/{id}")
    Mono<Account> findById(@PathVariable("id") Long id){
        return accountService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return accountService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return accountService.delete(id);
    }
}
