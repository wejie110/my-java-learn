package com.example.zuul.lwjzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LwjZuulApplication {
//试试
	public static void main(String[] args) {
		SpringApplication.run(LwjZuulApplication.class, args);
	}

}
