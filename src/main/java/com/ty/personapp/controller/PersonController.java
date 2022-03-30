package com.ty.personapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.personapp.dto.Person;
import com.ty.personapp.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@PostMapping("/person")
	public Person savePerson(@RequestBody @Valid Person person) { 
		return personService.savePerson(person);
	}
	
	@GetMapping("/person")
	public Person getPersonById( @RequestParam  int id) {
		return personService.getPersonById(id);
	}

}
