package com.adrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author AdrainHuang
 * @Date 2019/9/28 12:21
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ServerProviderApplication {


	public static void main(String[] args) {
		SpringApplication.run(ServerProviderApplication.class, args);
	}
}
