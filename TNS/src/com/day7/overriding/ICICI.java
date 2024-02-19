package com.day7.overriding;
//subclass
public class ICICI extends RBI {

	@Override
	public float getrateOfInterest() {
		// TODO Auto-generated method stub
		return 8.0f;
	}

	@Override
	public String toString() {
		return "ICICI [getrateOfInterest()=" + getrateOfInterest() + "]";
	}

}
