package com.day13.oopsAndArray;
// combining concept of oops with array
public class Student {
	private int id;
	private String Name;
	private int standard;
	private char section;
	
	// constructor 
	public Student(int id, String name, int standard, char section) {
		super();
		this.id = id;
		Name = name;
		this.standard = standard;
		this.section = section;
	}
	//getter and setter method
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}

}
