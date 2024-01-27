package com.day5;

public class Address {
	private String houseNo;
	private String streetNo;
	private String city;
	private String state;
	private String pincode;
	// constructor
	
	public Address(String houseNo, String streetNo, String city, String state, String pincode) {
		super();
		this.houseNo = houseNo;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	// GETTER SETTER
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetNo=" + streetNo + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}

	
	
}
