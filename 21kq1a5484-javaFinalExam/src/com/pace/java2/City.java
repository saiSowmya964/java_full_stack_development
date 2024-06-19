package com.pace.java2;

public class City {
	String name;
	String famousFor;
	long population;
	String state;
	
	public City(String name, String famousFor, long population, String state) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.population = population;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
