package com.craft.demo.simpleRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.craft.demo.simpleRest.manager.SimpleRestManager;
import com.craft.demo.simpleRest.model.Person;


@RestController
public class SimpleRestController {
	
	@Autowired
	SimpleRestManager simpleRestManager;
	
	@RequestMapping(method=RequestMethod.GET, value="/persons")
	public Iterable<Person> getAllPersons(){
		return simpleRestManager.getAllPersons();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/person/{id}")
	public Person getPerson(@PathVariable String id){
		return simpleRestManager.getPerson(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/person")
	public ResponseEntity<?> addPerson(@RequestBody Person person){
		simpleRestManager.addPerson(person);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/person/{id}")
	public void deletePerson(@PathVariable String id){
		simpleRestManager.deletePerson(id);
	}

}
