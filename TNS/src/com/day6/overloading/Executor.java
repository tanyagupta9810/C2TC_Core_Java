package com.day6.overloading;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_overloading m = new Method_overloading();
		System.out.println("When addition of (2+2) result is:-\n"+ m.addition(2,2));
		System.out.println("When addition of (2+2.3) result is in integer:-\n"+ m.addition(2, 2.3f));
		System.out.println("When addition of (2.3+2) result is in float:-\n"+ m.addition(2.3f, 2));
		System.out.println("When addition of (2.3+2.3) result is:-\n"+ m.addition(2.3f, 2.3f));
					
		
		
		
	}

}
