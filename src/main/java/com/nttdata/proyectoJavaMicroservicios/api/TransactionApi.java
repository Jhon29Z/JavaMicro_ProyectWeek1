package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.Transaction;
import com.nttdata.proyectoJavaMicroservicios.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "transactions")
public class TransactionApi {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    Flux<Transaction> findAll(){
        return transactionService.findAll();
    }

    @PostMapping
    Mono<Transaction> create(@RequestBody Transaction transaction){
        return transactionService.save(transaction);
    }

    @PutMapping
    Mono<Transaction> update(@RequestBody Transaction transaction){
        return transactionService.save(transaction);
    }

    @GetMapping("/{id}")
    Mono<Transaction> findById(@PathVariable("id") Long id){
        return transactionService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return transactionService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return transactionService.delete(id);
    }
}
