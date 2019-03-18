package com.adrain;

import com.adrain.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = PersonService.class)
public class PersonClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(PersonClientApplication.class, args);
	}
}
