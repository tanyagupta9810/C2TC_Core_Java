package com.day13.oopsAndArray;

public class Exceutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student a[];// array declaration
		a=new Student[5];// array creation
		
		//array initialization
		a[0]=new Student(101,"Saloni",10,'B');
		a[1]=new Student(102,"Rohan",11,'C');
		a[2]=new Student(103,"Shweta",10,'A');
		a[3]=new Student(104,"Suraj",10,'B');
		a[4]=new Student(105,"Aditi",11,'B');
		
		// Accessing the array
		System.out.println("Elements of array are:-\n");
		System.out.println("ID\tName\tStandard   Section");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].getId()+"\t"+a[i].getName()+"\t"+a[i].getStandard()+"         "+a[i].getSection());
		}
		
	}

}
