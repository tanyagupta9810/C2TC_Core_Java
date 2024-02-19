package com.day14.keyword;

public class staticDemo {
	String name;
	int age;
	static String batchNo="SF01";
	
	
	public staticDemo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "staticDemo [name=" + name + ", age=" + age +", batchNo="+batchNo+ "]";
	}
	
	

}
