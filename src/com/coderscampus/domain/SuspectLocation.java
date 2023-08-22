// Unit 10 - ifPresent Practice Exercise
package com.coderscampus.domain;

import java.util.Optional;

public class SuspectLocation {

	private String name;
	private String country;
	private Optional<SuspectLocation> nameOpt = Optional.empty();

//	public SuspectLocation(String name, String country) {
//		this.name = name;
//		this.country = country;
//	}
	
	
	public SuspectLocation(String[] suspectInfo) {
		this.name = suspectInfo[0];
		this.country = suspectInfo[1];
	}

//	public SuspectLocation(String name2, String country2) {
//		// TODO Auto-generated constructor stub
//	}

	// Using this constructor with the FileService for now and ignoring the other one
	public SuspectLocation(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public Optional<SuspectLocation> getNameOpt() {
		return nameOpt;
	}
	
	public void setNameOpt(SuspectLocation name) {
		this.nameOpt = Optional.of(name);
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
