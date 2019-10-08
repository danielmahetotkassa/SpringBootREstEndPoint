package org.bmo.customer.service;

import java.util.List;

import org.bmo.customer.model.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

	public List<Person> getPersons();

	public Person getOnePersons(int personid);

	public void savePerson(Person person);

	public Person create(Person person);

	public Person delete(int id);

	public List<Person> findAll();

	public Person findById(int id);

	public Person update(Person person);
	
	public List<Person> getPersonByName(String name);
}
