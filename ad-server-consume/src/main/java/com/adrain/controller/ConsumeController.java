package com.adrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author AdrainHuang
 * @Date 2019/9/28 17:07
 **/
@RestController
public class ConsumeController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/consume/{appName}")
	public String get(@PathVariable("appName") String appName){
		return this.restTemplate.getForEntity("http://"+appName+"/server/provider", String.class).getBody();
	}
}
