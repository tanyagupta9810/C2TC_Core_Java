package com.day15.staticClass;

public class Vechicle {
// outer class
	int manufacture_year;
	static String emission = "Petrol";
	static void  display()
	{
		System.out.println("Vechicle....");	}
	static class Car{
		static void display2() {
		System.out.println(emission);
		display();
	}
	}
}
