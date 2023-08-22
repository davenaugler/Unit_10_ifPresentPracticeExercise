// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

public class SuspectLocation {
	
	// Ran into HUGE MISUNDERSTANDING on this exercise
	// When you are reading a CSV file, make sure your Constructor 
	// is listing the CSV Column names in order from left to right.
	// The FileService is utilizing the Constructor and it will interpret 
	// the CSV Column names from your constructor. 

	private String country;
	private String name;

	public SuspectLocation(String name, String country) {
		this.country = country;
		this.name = name;
	}

	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


//	@Override
//	public String toString() {
//		return "SuspectLocation [Name: " + name + ", Country: " + country + "]";
//	}
	

	// This toString() is here simply for simplicity on reading the CSV content 
	@Override
	public String toString() {
		return name + " " + country;
	}
	
	

}
