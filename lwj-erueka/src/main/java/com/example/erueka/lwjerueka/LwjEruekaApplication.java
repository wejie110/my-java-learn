package com.example.erueka.lwjerueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LwjEruekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LwjEruekaApplication.class, args);
	}

}
