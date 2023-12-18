package com.zhao.sbsc17.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Sbsc17ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sbsc17ClientApplication.class, args);
    }

}
