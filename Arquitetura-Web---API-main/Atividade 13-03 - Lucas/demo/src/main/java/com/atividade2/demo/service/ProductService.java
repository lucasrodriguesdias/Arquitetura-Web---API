package com.atividade2.demo.service;

// service/ProductService.java
import com.atividade2.demo.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // GET: Retorna todos os produtos
    public List<Product> getAllProducts() {
        return products;
    }

    // POST: Adiciona um novo produto
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }
}
