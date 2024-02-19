package com.day14.keyword;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int age = 45;// constant
	
		//	age+=5; because final variable cannot be updated
		
	}
}


// final class 

final class Vehicle{
}
// class Car extends Vehicle error because final class cannot be inherited


// final method
class parent{
	void property()
	{
		System.out.println("Property :- Cash , Gold, House.....");
		}
	 final void marray() {
		 System.out.println("Marray Kritika.......");
	 }
}
class child extends parent{
	// void marray() {}// error because final method does not overriding..

}
