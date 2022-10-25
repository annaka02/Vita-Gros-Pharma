package com.saraya.model;

public class vet {
	private int id;
	private String name;
	private String specialities;
	public vet(int id, String name, String specialities) {
		this.id = id;
		this.name = name;
		this.specialities = specialities;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialities() {
		return specialities;
	}
	public void setSpecialities(String specialities) {
		this.specialities = specialities;
	}

}
