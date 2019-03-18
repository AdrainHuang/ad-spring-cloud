package com.adrain.service;

import com.adrain.domain.Person;
import com.adrain.fallback.PersonServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

//实现接口类的spring.application.name
@FeignClient(value = "person-service",fallback = PersonServiceFallBack.class)
public interface PersonService {
	
	@PostMapping(value = "/person/save")
	boolean save(Person person);
	
	@GetMapping(value = "/person/find/all")
	Collection<Person> findAll();

}
