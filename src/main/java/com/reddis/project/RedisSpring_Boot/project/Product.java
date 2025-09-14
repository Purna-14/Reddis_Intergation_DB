package com.reddis.project.RedisSpring_Boot.project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private Long id;
    private String name;

    public Product() {}

    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}

