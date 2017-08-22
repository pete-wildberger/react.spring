package com.javareact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String description;
  private int age;

	private Employee() {}

	public Employee(String firstName, String lastName, String description, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
    this.age = age;
	}
}
