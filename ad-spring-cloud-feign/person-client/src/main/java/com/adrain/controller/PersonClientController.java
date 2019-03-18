package com.adrain.controller;

import com.adrain.domain.Person;
import com.adrain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author AdrainHuang
 * @Date 2019/3/15 上午11:09
 **/
@RestController
public class PersonClientController implements PersonService {
	
	private final PersonService personService;
	
	@Autowired
	public PersonClientController(PersonService personService) {
		this.personService = personService;
	}
	
	@Override
	public boolean save(@RequestBody Person person) {
		return personService.save(person);
	}
	
	@Override
	public Collection<Person> findAll() {
		return personService.findAll();
	}
}
