package com.crobatair.saga.estore.ProductsService.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @PostMapping
    public String createProduct() {
        return "HTTP POST is handled";
    }

    @GetMapping
    public String getProducts() {
        return "HTTP GET is handled";
    }

    @PutMapping
    public String updateProduct() {
        return "HTTP PUT is handled";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "HTTP DELETE is handled";
    }

}
