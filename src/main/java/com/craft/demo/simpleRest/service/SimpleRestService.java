package com.craft.demo.simpleRest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craft.demo.simpleRest.model.Person;
import com.craft.demo.simpleRest.repository.PersonRepository;


@Service
public class SimpleRestService {

	@Autowired
	PersonRepository personRepository;
	
	public Iterable<Person> getAllPersons(){
		return personRepository.findAll();
	}
	
	public Person getPerson(String id){
		return personRepository.findById(id).orElse(null);
	}
	
	public void addPerson(Person person){
		personRepository.save(person);
	}
	
	public void deletePerson(String id){
		personRepository.deleteById(id);
	}
}
