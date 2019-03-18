package com.adrain.adspcloudhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class AdSpcloudHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdSpcloudHystrixApplication.class, args);
	}

}
