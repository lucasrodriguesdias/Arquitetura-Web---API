package com.atividade2.demo.model;

// model/Product.java
public class Product {

    private Long id;
    private String name;

    // Construtor vazio (obrigatório para desserialização)
    public Product() {}

    // Construtor com campos
    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters e Setters
    public Long getId() {
        return id; 
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 