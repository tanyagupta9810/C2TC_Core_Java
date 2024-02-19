package com.day9.string;

public class StringHandling {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		// 2 objects are created 1 in heap and another in string constant pool
		String s1= new String("Tanya");
		System.out.println(s1);
		
		//1 object is created only in string constant pool
		String s2="Gupta";
		System.out.println(s2);
		
		//string and stringBuffer
		System.out.println("Befer String is:- "+s1);
		s1.concat("Gupta");//immutable--> unchangeable
		System.out.println("After Concatenation String is:- "+s1);
		
		System.out.println("Befer StringBuffer is:- "+s1);
		StringBuffer s3= new StringBuffer("Tanya");
		s3.append(" Gupta");// mutable --> changeable
		System.out.println("After concatenation StringBuffer is:- "+s3);
		
		String s4=s1.toUpperCase();
		String s5="Tanya";
		String s6="Tanya";
		String s7= s1.concat(" Gupta");

		System.out.println("\nLength of  String "+s1+" is:- "+s1.length());
		System.out.println("\nSubstring of  String "+s7+" is:- "+s7.substring(5));
		System.out.println("Substring of  String "+s7+" is:- "+s7.substring(2,7));
		System.out.println("\nChar at index 2 of  String "+s7+" is:- "+s7.charAt(2));
		System.out.println("Index of G in String "+s7+" is:- "+ s7.indexOf('G') );
		System.out.println("Last Index of a in String "+s7+" is:- "+ s7.lastIndexOf('a'));
		System.out.println("\nCheck if string "+s7+" start with T or not:- "+s7.startsWith("T", 0));
		System.out.println("\nReplace a with i in string "+s7+" :- "+s7.replace('a','i'));
		System.out.println("Replace Gupta with Kumar in string "+s7+" :- "+s7.replace("Gupta","Kumar"));
		System.out.println("Uppercase String is:- "+s4);
		
		
		System.out.println("\nCompare String "+s1+" and "+s5+" using equals is:- "+(s1.equals(s5)));
		System.out.println("Compare String "+s1+" and "+s5+" using == is:- "+(s1==s5));//as not referring to same object
		System.out.println("Compare String "+s6+" and "+s5+" using == is:- "+(s5==s6));
		System.out.println("Compare String "+s1+" and "+s4+" using equalsIgnoreCase is:- "+s1.equalsIgnoreCase(s4));
		System.out.println("Compare String "+s1+" and "+s4+" using equals is:- "+s1.equals(s4));
		System.out.println("Compare String "+s1+" and "+s4+" using compareTo is:- "+s1.compareTo(s4));
		System.out.println("Compare String "+s1+" and "+s4+" using compareToIgnoreCase is:- "+ s1.compareToIgnoreCase(s4));
		




		}

}
