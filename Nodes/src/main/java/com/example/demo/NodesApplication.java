package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan("com.example.demo.entity")
public class NodesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NodesApplication.class, args);
	}

}
