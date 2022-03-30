package com.ty.personapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.personapp.dto.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	

}
