package com.nttdata.proyectoJavaMicroservicios.service.impl;

import com.nttdata.proyectoJavaMicroservicios.model.document.CoinType;
import com.nttdata.proyectoJavaMicroservicios.repository.CoinTypeRepository;
import com.nttdata.proyectoJavaMicroservicios.service.CoinTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CoinTypeServiceImpl implements CoinTypeService {

    @Autowired
    private CoinTypeRepository coinTypeRepository;

    @Override
    public Flux<CoinType> findAll() {
        return this.coinTypeRepository.findAll();
    }

    @Override
    public Mono<CoinType> save(CoinType coinType) {
        return this.coinTypeRepository.save(coinType);
    }

    @Override
    public Mono<CoinType> findById(Long id) {
        return this.coinTypeRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(Long id) {
        return this.coinTypeRepository.existsById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
        this.coinTypeRepository.deleteById(id);
        return null;
    }
}
