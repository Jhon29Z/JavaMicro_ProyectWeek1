package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.AuthorizedSigner;
import com.nttdata.proyectoJavaMicroservicios.service.AuthorizedSignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "authorizedSigners")
public class AuthorizedSignerApi {

    @Autowired
    private AuthorizedSignerService authorizedSignerService;

    @GetMapping
    Flux<AuthorizedSigner> findAll(){
        return authorizedSignerService.findAll();
    }

    @PostMapping
    Mono<AuthorizedSigner> create(@RequestBody AuthorizedSigner authorizedSigner){
        return authorizedSignerService.save(authorizedSigner);
    }

    @PutMapping
    Mono<AuthorizedSigner> update(@RequestBody AuthorizedSigner authorizedSigner){
        return authorizedSignerService.save(authorizedSigner);
    }

    @GetMapping("/{id}")
    Mono<AuthorizedSigner> findById(@PathVariable("id") Long id){
        return authorizedSignerService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return authorizedSignerService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return authorizedSignerService.delete(id);
    }
}
