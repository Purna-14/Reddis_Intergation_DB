package com.reddis.project.RedisSpring_Boot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSpringBootProjectApplication.class, args);
	}

}
