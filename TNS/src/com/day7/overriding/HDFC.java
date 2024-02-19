package com.day7.overriding;
//subclass
public class HDFC extends RBI {
	@Override
	public float getrateOfInterest() {
		// TODO Auto-generated method stub
		return 7.3f;
	}

	@Override
	public String toString() {
		return "HDFC [getrateOfInterest()=" + getrateOfInterest() + "]";
	}

}
