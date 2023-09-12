package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String dept;
	private double salary;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void setSalary(double sal) {
		this.salary = sal;
	}
	
	public double getSalary() {
		return this.salary;
	}
}
