// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

public class SuspectLocation {
	
	private String country;
	private String name;

	// Remember to build out Constructor exactly how the CSV files have their header written out.
	// If not, your logic within your FileService won't retrieve the data as you are expecting.
	public SuspectLocation(String country, String name) {
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
