package com.practice1;

import java.util.Scanner;

public class seriesExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms in Fabonacci Series:- ");
		int n = sc.nextInt();
		fabonacciSeries fs = new fabonacciSeries();
		fs.Series(n);
	}

}
