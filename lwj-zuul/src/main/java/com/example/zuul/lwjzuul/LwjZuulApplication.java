package com.example.zuul.lwjzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class LwjZuulApplication {
//试试
	public static void main(String[] args) {
		SpringApplication.run(LwjZuulApplication.class, args);
	}

}
