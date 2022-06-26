package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.Client;
import com.nttdata.proyectoJavaMicroservicios.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping(value = "clients")
public class ClientApi {
    @Autowired
    private ClientService clientService;

    @GetMapping
    Flux<Client> findAll(){
        return clientService.findAll();
    }

    @PostMapping
    Mono<Client> create(@RequestBody Client client){
        return clientService.save(client);
    }

    @PutMapping
    Mono<Client> update(@RequestBody Client client){
        return clientService.save(client);
    }

    @GetMapping("/{id}")
    Mono<Client> findById(@PathVariable("id") Long id){
        return clientService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return clientService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return clientService.delete(id);
    }
}
