package com.ty.personapp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.personapp.dto.Person;
import com.ty.personapp.repository.PersonRepository;

@Repository
public class PersonDao {

	@Autowired
   private PersonRepository personRepository;
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
	public Person getPersonById(int id) {
		Optional< Person> optional=personRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}
}
