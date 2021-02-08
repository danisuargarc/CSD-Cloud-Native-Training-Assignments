package com.web.assignment;

public class Zipcode {
	private String zipcode;
	private String state;
	private String city;
	private String country;
	public Zipcode(String zipcode, String state, String city, String country) {
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
