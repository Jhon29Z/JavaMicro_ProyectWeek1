package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.ProductType;
import com.nttdata.proyectoJavaMicroservicios.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "productTypes")
public class ProductTypeApi {

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping
    Flux<ProductType> findAll(){
        return productTypeService.findAll();
    }

    @PostMapping
    Mono<ProductType> create(@RequestBody ProductType productType){
        return productTypeService.save(productType);
    }

    @PutMapping
    Mono<ProductType> update(@RequestBody ProductType productType){
        return productTypeService.save(productType);
    }

    @GetMapping("/{id}")
    Mono<ProductType> findById(@PathVariable("id") Long id){
        return productTypeService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return productTypeService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return productTypeService.delete(id);
    }
}
