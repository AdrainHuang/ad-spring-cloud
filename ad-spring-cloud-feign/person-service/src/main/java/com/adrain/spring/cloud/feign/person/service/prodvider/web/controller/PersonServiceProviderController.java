package com.adrain.spring.cloud.feign.person.service.prodvider.web.controller;

import com.adrain.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author AdrainHuang
 * @Date 2019/3/15 上午11:20
 **/
@RestController
public class PersonServiceProviderController {
	
	private final Map<Long, Person> persons = new ConcurrentHashMap<>();
	
	@PostMapping(value = "/person/save")
	public boolean save(@RequestBody Person person) {
		return persons.put(person.getId(), person) == null;
	}
	
	@GetMapping(value = "/person/find/all")
	public Collection<Person> findAll() {
		return persons.values();
	}
}
