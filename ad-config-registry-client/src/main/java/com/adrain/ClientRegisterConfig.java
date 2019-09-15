package com.adrain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author AdrainHuang
 * @Date 2019/9/14 22:38
 **/
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClientRegisterConfig {
	
	public static void main(String[] args) {
		SpringApplication.run(ClientRegisterConfig.class, args);
	}
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/services/{serviceName}")
	public List<ServiceInstance> getServiceInstances(@PathVariable String serviceName) {
		return this.discoveryClient.getInstances(serviceName);
	}
	
	@GetMapping("service/{serviceName}/{instanceId}")
	public ServiceInstance getServiceInstance(@PathVariable String serviceName, @PathVariable String instanceId) {
		return getServiceInstances(serviceName)
		.stream()
		.filter(serviceInstance -> instanceId.equals(serviceInstance.getInstanceId()))
		.findFirst()
		.orElseThrow(() -> new RuntimeException("No Such service instance"));
	}
}
