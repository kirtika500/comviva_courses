package com.via.springbootweb;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class signup {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	
	String email;	
	String password;
	String address;
	String city;
	String state;
	public signup( String email, String password, String address, String city, String state) {
		super();
	
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	@Override
	public String toString() {
		return "signup [id=" + id + ", email=" + email + ", password=" + password + ", address=" + address + ", city="
				+ city + ", state=" + state + "]";
	}
}
