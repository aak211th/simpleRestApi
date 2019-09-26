package com.craft.demo.simpleRest.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.craft.demo.simpleRest.model.Person;
import com.craft.demo.simpleRest.service.SimpleRestService;

@Component
public class SimpleRestManager {
	
	@Autowired
	SimpleRestService restService;
	
	public Iterable<Person> getAllPersons() {
		return restService.getAllPersons();
	}

	public Person getPerson(String id) {
		return restService.getPerson(id);
	}

	public void addPerson(Person person) {
		restService.addPerson(person);
	}

	public void deletePerson(String id) {
		restService.deletePerson(id);
	}
	
}
