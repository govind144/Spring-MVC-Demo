package com.gkn.springmvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;

	private String lastName;

	private String country;
	private String[] os;
	private LinkedHashMap<String, String> countryOption;

	public Student() {
		countryOption = new LinkedHashMap<String, String>();
		countryOption.put("BR", "BRAZIL");
		countryOption.put("FR", "FRANCE");
		countryOption.put("IN", "INDIA");
		countryOption.put("RUS", "RUSSIA");
		countryOption.put("USA", "United States Of America");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

}
