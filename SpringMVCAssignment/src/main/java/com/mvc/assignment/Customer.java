package com.mvc.assignment;

public class Customer {
	private String username;
	
	private String password;
	
	private String email;
	
	private String contact;

	private String city;

	private int zipcode;
	
	public Customer(String username, String password, String email, String contact, String city, int zipcode) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.city = city;
		this.zipcode = zipcode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
