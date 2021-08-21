package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Student {

	private String firstName;

	
	private String lastName;

	private String country;

	private String language;

	private String favoriteLanguage;

	private LinkedHashMap<String, String> languages;

	private LinkedList<String> operatingSystem;

	public Student() {

		languages = new LinkedHashMap<String, String>();
		languages.put("EN", "English");
		languages.put("Hi", "Hindi");
		languages.put("FR", "France");
		languages.put("NL", "Dutch");
		languages.put("GE", "Germany");

		operatingSystem = new LinkedList<String>();
		operatingSystem.add("Linux");
		operatingSystem.add("Mac OS");
		operatingSystem.add("MS Windows");

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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LinkedHashMap<String, String> getLanguages() {
		return languages;
	}

	public void setLanguages(LinkedHashMap<String, String> languages) {
		this.languages = languages;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedList<String> getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(LinkedList<String> operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
