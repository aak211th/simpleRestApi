package com.craft.demo.simpleRest.repository;

import org.springframework.data.repository.CrudRepository;

import com.craft.demo.simpleRest.model.Person;

public interface PersonRepository extends CrudRepository<Person, String>{

}
