package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.Client;
import com.nttdata.proyectoJavaMicroservicios.repository.ClientRepository;
import com.nttdata.proyectoJavaMicroservicios.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Flux<Client> findAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Mono<Client> save(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Mono<Client> findById(Long id) {
        return this.clientRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.clientRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.clientRepository.deleteById(id);
        return null;
    }
}
