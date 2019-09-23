package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="designation")
	private String designation;
	
	public Customer() {
		
	}
	
	public Customer(String ename, int salary, String designation) {
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation + "]";
	}

}





