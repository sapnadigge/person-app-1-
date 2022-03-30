package com.ty.personapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "name should not be null")
	private String name;
	@NotNull(message = "Email should not be null")
	private String email;
	private long phone;
	private String password;
	
	//no getters and setters

}
