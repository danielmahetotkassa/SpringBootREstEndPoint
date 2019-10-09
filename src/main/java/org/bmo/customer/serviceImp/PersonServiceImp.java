package org.bmo.customer.serviceImp;

import java.util.List;

import org.bmo.customer.dao.PersonDao;
import org.bmo.customer.model.Person;
import org.bmo.customer.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {

	@Autowired
	PersonDao personDao;

	@Override
	public List<Person> getPersons() {

		List<Person> persons = personDao.findAll();

		return persons;
	}

	@Override
	public Person getOnePersons(int personid) {

		Person person = personDao.getOne(personid);

		return person;
	}

	
	@Override
	public List<Person> getPersonByName(String name){
		
	   return personDao.findByName(name);
		
	}
	@Override
	public void savePerson(Person person) {

		personDao.save(person);

	}

	@Override
	public Person create(Person person) {
		return personDao.save(person);
	}

	@Override
	public void delete(int id) {
		Person person = findById(id);
		if (person != null) {
			personDao.delete(person);
		}
	}

	@Override
	public List<Person> findAll() {
		return personDao.findAll();
	}

	@Override
	public Person findById(int id) {
		return personDao.getOne(id);
	}

	@Override
	public Person update(Person person) {
		return person;
	}
	
	
	public List<Person> findByFirst_name(String firstName){
		
		return personDao.findByName(firstName);
		
	}

}
