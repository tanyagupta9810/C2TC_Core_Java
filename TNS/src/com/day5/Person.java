package com.day5;

public class Person {	
	private int personId;
	private String personName;
	private Address address;
	
	// Constructor
	public Person(int personId, String personName, Address address) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.address = address;
	}

	// Getter and SETTER
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", address=" + address + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	

	
	
	
}
