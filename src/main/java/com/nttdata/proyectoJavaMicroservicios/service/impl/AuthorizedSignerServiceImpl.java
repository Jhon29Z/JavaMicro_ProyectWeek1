package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.AuthorizedSigner;
import com.nttdata.proyectoJavaMicroservicios.repository.AuthorizedSignerRepository;
import com.nttdata.proyectoJavaMicroservicios.service.AuthorizedSignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AuthorizedSignerServiceImpl implements AuthorizedSignerService {

    @Autowired
    private AuthorizedSignerRepository authorizedSignerRepository;

    @Override
    public Flux<AuthorizedSigner> findAll() {
        return this.authorizedSignerRepository.findAll();
    }

    @Override
    public Mono<AuthorizedSigner> save(AuthorizedSigner authorizedSigner) {
        return this.authorizedSignerRepository.save(authorizedSigner);
    }

    @Override
    public Mono<AuthorizedSigner> findById(Long id) {
        return this.authorizedSignerRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.authorizedSignerRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.authorizedSignerRepository.deleteById(id);
        return null;
    }
}
