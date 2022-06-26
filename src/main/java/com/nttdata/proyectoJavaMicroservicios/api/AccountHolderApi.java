package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.AccountHolder;
import com.nttdata.proyectoJavaMicroservicios.service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "accountHolders")
public class AccountHolderApi {

    @Autowired
    private AccountHolderService accountHolderService;

    @GetMapping
    Flux<AccountHolder> findAll(){
        return accountHolderService.findAll();
    }

    @PostMapping
    Mono<AccountHolder> create(@RequestBody AccountHolder accountHolder){
        return accountHolderService.save(accountHolder);
    }

    @PutMapping
    Mono<AccountHolder> update(@RequestBody AccountHolder accountHolder){
        return accountHolderService.save(accountHolder);
    }

    @GetMapping("/{id}")
    Mono<AccountHolder> findById(@PathVariable("id") Long id){
        return accountHolderService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return accountHolderService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return accountHolderService.delete(id);
    }

}
