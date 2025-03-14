package com.atividade2.demo.controller;

// controller/ProductController.java
import com.atividade2.demo.model.Product;
import com.atividade2.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET: http://localhost:8080/api/products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // POST: http://localhost:8080/api/products
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}

