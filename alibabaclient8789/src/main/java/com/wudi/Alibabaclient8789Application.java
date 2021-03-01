package com.wudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Alibabaclient8789Application {

    public static void main(String[] args) {
        SpringApplication.run(Alibabaclient8789Application.class, args);
    }

}
