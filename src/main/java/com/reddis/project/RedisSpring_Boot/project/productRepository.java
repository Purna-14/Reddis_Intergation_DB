package com.reddis.project.RedisSpring_Boot.project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product, Long> {
}

