package org.bmo.customer.dao;

import java.util.List;

import org.bmo.customer.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {


	@Query("SELECT u FROM Person u WHERE u.first_name = ?1")
	List<Person> findByName(String name);
}
