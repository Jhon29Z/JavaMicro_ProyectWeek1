package com.nttdata.proyectoJavaMicroservicios.api;

import com.nttdata.proyectoJavaMicroservicios.model.document.Product;
import com.nttdata.proyectoJavaMicroservicios.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "products")
public class ProductApi {
    @Autowired
    private ProductService productService;

    @GetMapping
    Flux<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping
    Mono<Product> create(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping
    Mono<Product> update(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping("/{id}")
    Mono<Product> findById(@PathVariable("id") Long id){
        return productService.findById(id);
    }

    @GetMapping("/{id}")
    Mono<Boolean> existsById(@PathVariable("id") Long id){
        return productService.existsById(id);
    }

    @DeleteMapping("/{id}")
    Mono<Void>delete(@PathVariable("id") Long id  ){
        return productService.delete(id);
    }
}
