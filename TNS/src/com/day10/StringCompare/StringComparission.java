package com.day10.StringCompare;

public class StringComparission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Tanya";//string constant pool
		String s2="Tanya";//string constant pool
		String s3= new String("Tanya");//heap area
		String s4= new String("Tanya");//heap area
		
		//==(equal operator):- comparing reference and address of string
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1==s3:"+(s1==s3));
		System.out.println("s4==s3:"+(s4==s3));
		
		//equals() method :- comparing content
		System.out.println("s1.equals(s2) :"+s1.equals(s2));
		System.out.println("s1.equals(s3) :"+s1.equals(s3));
		System.out.println("s3.equals(s4) :"+s3.equals(s4));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compareTo() method:- lexicographically comparison
		System.out.println("s3.compareTo(TANYA):- " + s3.compareTo("TANYA"));
		System.out.println("s3.compareTo(tanya):- " + s3.compareTo("tanya"));
		
		//compareToIgnoreCase
		System.out.println("s3.compareToIgnoreCase(TANYA):- " + s3.compareToIgnoreCase("TANYA"));
		
		//equalsIgnoreCase
		System.out.println("s3.equalsIgnoreCase(tanYA):- " + s3.equalsIgnoreCase("tanYA"));
	}

}
