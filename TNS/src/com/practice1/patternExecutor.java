package com.practice1;

import java.util.Scanner;

public class patternExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='n';
		Scanner sc = new Scanner(System.in);
		Pattern p= new Pattern();
		do {
			System.out.println("-------Pattern-------\n1. Right Half Pyramid\n2. Square Fill Pattern\n3. Zero-One Triangle\n4. Hollow Hourglass Pattern\n\nEnter Choice:- ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
			p.rightHalfPyramid(6);
			break;
			case 2:
			p.squareFillPattern(6);
			break;
			case 3:
			p.zeroOneTriangle(4);
			break;
			case 4:
			p.hollowHourglassPattern(4);
			break;
			}
			System.out.println("Do you want to continue (y/n):-");
			a=sc.next().charAt(0);		
		}while(a=='y');
	}

}
