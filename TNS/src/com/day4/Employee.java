package com.day4;

public class Employee{
	private int id;
	private String name;
	private String Department;

	//Constructor
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
	}
	//Getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Department=" + Department + "]";
	}
	
}
