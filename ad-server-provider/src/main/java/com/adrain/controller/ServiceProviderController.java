package com.adrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author AdrainHuang
 * @Date 2019/9/28 16:46
 **/
@RestController
public class ServiceProviderController {

	@Autowired
	private Environment environment;
	
	@GetMapping("/server/provider")
	public String get() {
		return this.environment.getProperty("spring.application.name");
	}
}
