package com.adrain.spring.cloud.feign.person.service.prodvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author AdrainHuang
 * @Date 2019/3/15 上午11:17
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PersonServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonServiceProviderApplication.class,args);
	}
}
