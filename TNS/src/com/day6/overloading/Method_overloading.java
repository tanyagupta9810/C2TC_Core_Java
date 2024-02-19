package com.day6.overloading;

public class Method_overloading {
	 int addition(int a, int b) {
		 return a+b;
	 }
	 int addition(int a,float b) {
		 return (int)(a+b) ;
	 }
	 float addition(float a, float b)
	 {
		 return a+b;
	 }
	 float addition(float a, int b)
	 {
		 return (a+b);}
}
