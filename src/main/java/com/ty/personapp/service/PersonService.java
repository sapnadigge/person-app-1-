package com.ty.personapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.personapp.dao.PersonDao;
import com.ty.personapp.dto.Person;

@Service
public class PersonService {
	@Autowired
	private PersonDao personDao;
	
	public Person savePerson(Person person) {
		return personDao.savePerson(person);
	}
	public Person getPersonById(int id) {
		return personDao.getPersonById(id);
	}

}
