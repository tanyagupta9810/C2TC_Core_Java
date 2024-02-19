package com.day7.overriding;
//subclass
public class PNB extends RBI {

	@Override
	public float getrateOfInterest() {
		// TODO Auto-generated method stub
		return 7.8f;
	}

	@Override
	public String toString() {
		return "PNB [getrateOfInterest()=" + getrateOfInterest() + "]";
	}

}
