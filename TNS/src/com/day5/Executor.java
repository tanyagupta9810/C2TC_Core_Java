package com.day5;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address("42A","54","Gurgaon","Haryana","122001");
		Person p1= new Person(101,"Tanya",a1);
		System.out.println(p1);
	}

}
