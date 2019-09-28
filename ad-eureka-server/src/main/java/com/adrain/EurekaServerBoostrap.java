package com.adrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author AdrainHuang
 * @Date 2019/9/14 20:21
 **/
public class EurekaServerBoostrap {
	
	@EnableAutoConfiguration
	@EnableEurekaServer
	public static class EurekaServerConfiguration {

	}
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerConfiguration.class, args);
	}

}
