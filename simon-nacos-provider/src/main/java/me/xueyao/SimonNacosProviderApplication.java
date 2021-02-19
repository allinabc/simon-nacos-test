package me.xueyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SimonNacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimonNacosProviderApplication.class, args);
    }


}
