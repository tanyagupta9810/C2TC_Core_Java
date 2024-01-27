package com.practice1;

import java.util.Scanner;
public class primeExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int a=sc.nextInt();
		prime p= new prime();
		if(p.prim(a))
			System.out.println(a+" is prime number!!");
		else
			System.out.println(a+" is not a prime number!!");
	}
}
