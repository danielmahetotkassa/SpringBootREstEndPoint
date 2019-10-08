package org.bmo.customer.controller;

import java.util.List;

import org.bmo.customer.model.Person;
import org.bmo.customer.serviceImp.PersonServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PersonController {

	@Autowired
	PersonServiceImp personService;

	@GetMapping("/api/persons")
	public List<Person> getAllPersons() {

		List<Person> persons = personService.getPersons();
		return persons;
	}

	@GetMapping("/api")
	public List<Person> getPersons() {

		List<Person> persons = personService.getPersons();
		return persons;
	}

	@PostMapping
	public void create(@RequestBody Person person) {

		personService.create(person);
	}

	@GetMapping(path = { "/{first_name}" })
	public List<Person> findByFirst_name(@PathVariable("first_name") String firstName) {
		return personService.findByFirst_name(firstName);
	}

	@PutMapping
	public Person update(@RequestBody Person person) {
		return personService.update(person);

	}

	@DeleteMapping(path = { "/{id}" })
	public List<Person> delete(@PathVariable("id") int id) {
		
		personService.delete(id);
		
		return personService.findAll();

	}


}
