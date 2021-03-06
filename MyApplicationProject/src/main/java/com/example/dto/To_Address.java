package com.example.dto;

public class To_Address {
	
	
	private String name;
	
	private String company;
	
	private String street1;
	
	private String street2;
	
	private String city;
	
	private String state;
	
	private Long zip;
	
	private String country;
	
	private String email;
	
	private Long phone;
	
	public To_Address() {
		
	}

	

	public To_Address(String name, String company, String street1, String street2, String city, String state, Long zip,
			String country, String email, Long phone) {
		super();
		this.name = name;
		this.company = company;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.email = email;
		this.phone = phone;
	}



	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getCompany() {
	return company;
	}

	public void setCompany(String company) {
	this.company = company;
	}

	public String getStreet1() {
	return street1;
	}

	public void setStreet1(String street1) {
	this.street1 = street1;
	}

	public String getStreet2() {
	return street2;
	}

	public void setStreet2(String street2) {
	this.street2 = street2;
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

	public Long getZip() {
	return zip;
	}

	public void setZip(Long zip) {
	this.zip = zip;
	}

	public String getCountry() {
	return country;
	}

	public void setCountry(String country) {
	this.country = country;
	}

	public String getEmail() {
	return email;
	}

	public void setEmail(String email) {
	this.email = email;
	}

	public Long getPhone() {
	return phone;
	}

	public void setPhone(Long phone) {
	this.phone = phone;
	}



	@Override
	public String toString() {
		return "To_Address [name=" + name + ", company=" + company + ", street1=" + street1 + ", street2=" + street2
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	

}
