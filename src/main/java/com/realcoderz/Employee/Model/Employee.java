package com.realcoderz.Employee.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="address")
	private String address;
	
	@Column(name="salary")
	private Long salary;
	
	
	@Column(name="designation")
	private String designation;


	public Employee(Long id, String name, String address, Long salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.designation = designation;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Long getSalary() {
		return salary;
	}


	public void setSalary(Long salary) {
		this.salary = salary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public Employee() {
		
	}
	
	
	

}
