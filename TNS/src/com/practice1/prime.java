package com.practice1;

public class prime {
	boolean prim(int n)
	{
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
