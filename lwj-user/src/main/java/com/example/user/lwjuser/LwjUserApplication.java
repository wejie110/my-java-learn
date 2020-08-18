package com.example.user.lwjuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LwjUserApplication {
    public static void main(String[] args){
        try {
            SpringApplication.run(LwjUserApplication.class,args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
