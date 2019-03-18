package com.adrain.fallback;

import com.adrain.domain.Person;
import com.adrain.service.PersonService;

import java.util.Collection;
import java.util.Collections;

/**
 * @Author AdrainHuang
 * @Date 2019/3/18 上午10:34
 **/
public class PersonServiceFallBack implements PersonService {
	@Override
	public boolean save(Person person) {
		System.out.printf("PersonServiceFallBack,save");
		return false;
	}
	
	@Override
	public Collection<Person> findAll() {
		System.out.println("空集合");
		return Collections.emptyList();
	}
}
