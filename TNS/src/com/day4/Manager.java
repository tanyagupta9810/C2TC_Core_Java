package com.day4;

public class Manager extends Employee{
	private int teamSize;

	// Constructor
	public Manager(int id, String name, String department, int teamSize) {
		super(id, name, department);
		this.teamSize = teamSize;
	}

	//Getter and Setter
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDepartment()=" + getDepartment() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	

	


	
	
	
	
	
	
}
