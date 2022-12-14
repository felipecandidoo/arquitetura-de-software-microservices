package com.bancoaq4.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class BancoAq4Application {

    public static void main(String[] args) {

        SpringApplication.run(BancoAq4Application.class, args);
    }

}
