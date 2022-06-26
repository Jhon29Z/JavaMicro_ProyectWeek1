package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.CustomerType;
import com.nttdata.proyectoJavaMicroservicios.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "customerTypes")
public class CustomerTypeApi {

    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping
    Flux<CustomerType> findAll(){
        return customerTypeService.findAll();
    }

    @PostMapping
    Mono<CustomerType> create(@RequestBody CustomerType customerType){
        return customerTypeService.save(customerType);
    }

    @PutMapping
    Mono<CustomerType> update(@RequestBody CustomerType customerType){
        return customerTypeService.save(customerType);
    }

    @GetMapping("/{id}")
    Mono<CustomerType> findById(@PathVariable("id") Long id){
        return customerTypeService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return customerTypeService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return customerTypeService.delete(id);
    }
}
