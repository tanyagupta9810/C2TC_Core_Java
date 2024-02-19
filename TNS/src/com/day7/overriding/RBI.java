package com.day7.overriding;
//super class
public class RBI {
	public float getrateOfInterest() {
		return 7.0f;
	}

	@Override
	public String toString() {
		return "RBI [getrateOfInterest()=" + getrateOfInterest() + "]";
	}
}
