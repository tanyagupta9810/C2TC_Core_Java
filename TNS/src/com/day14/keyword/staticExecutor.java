package com.day14.keyword;

public class staticExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Block......");
		staticDemo ob=new staticDemo("Tanya",22);
		System.out.println(ob);
	}
	static{
		System.out.println("1st static block.....");
	}
	static{
		System.out.println("2nd static block.....");
	}
	static{
		System.out.println("3rd static block.....");
	}
}
