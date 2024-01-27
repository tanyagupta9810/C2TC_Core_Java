package com.day1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Tanya");
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 Numbers:-");
		a= sc.nextInt();
		b= sc.nextInt();
		c= a+b;
		System.out.println("Sum of "+a+" and "+b+" is :- "+c);
	}

}
