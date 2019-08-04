package com.atguigu.guigumall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GuigumallGatewayApplication {

    public static void main(String[] args) {

        SpringApplication.run(GuigumallGatewayApplication.class, args);
    }

}
