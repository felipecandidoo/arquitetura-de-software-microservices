package com.example.api.pagamentoboleto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class PagamentoBoletoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagamentoBoletoApplication.class, args);
    }

}
