package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.CoinType;
import com.nttdata.proyectoJavaMicroservicios.service.CoinTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "coinTypes")
public class CoinTypeApi {

    @Autowired
    private CoinTypeService coinTypeService;

    @GetMapping
    Flux<CoinType> findAll(){
        return coinTypeService.findAll();
    }

    @PostMapping
    Mono<CoinType> create(@RequestBody CoinType coinType){
        return coinTypeService.save(coinType);
    }

    @PutMapping
    Mono<CoinType> update(@RequestBody CoinType coinType){
        return coinTypeService.save(coinType);
    }

    @GetMapping("/{id}")
    Mono<CoinType> findById(@PathVariable("id") Long id){
        return coinTypeService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return coinTypeService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return coinTypeService.delete(id);
    }
}
