package br.com.odaguiri.reactive.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.odaguiri.reactive.domain.Product;
import br.com.odaguiri.reactive.repository.ProductRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BakeryController {

    private final ProductRepository productRepository;

    public BakeryController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public Flux<Product> getProducts() {
    	return productRepository.findAll();
    }

    @GetMapping("/products/{code}")
    public Mono<Product> getProductByCode(@PathVariable String code) {
        return productRepository.findByCode(code);
    }
}