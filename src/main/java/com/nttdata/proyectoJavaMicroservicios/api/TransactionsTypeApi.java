package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.TransactionsType;
import com.nttdata.proyectoJavaMicroservicios.service.TransactionsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "transactionsTypes")
public class TransactionsTypeApi {

    @Autowired
    private TransactionsTypeService transactionsTypeService;

    @GetMapping
    Flux<TransactionsType> findAll(){
        return transactionsTypeService.findAll();
    }

    @PostMapping
    Mono<TransactionsType> create(@RequestBody TransactionsType transactionsType){
        return transactionsTypeService.save(transactionsType);
    }

    @PutMapping
    Mono<TransactionsType> update(@RequestBody TransactionsType transactionsType){
        return transactionsTypeService.save(transactionsType);
    }

    @GetMapping("/{id}")
    Mono<TransactionsType> findById(@PathVariable("id") Long id){
        return transactionsTypeService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return transactionsTypeService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return transactionsTypeService.delete(id);
    }
}
