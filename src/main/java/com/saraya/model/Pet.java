package com.saraya.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Pet {
	private int id;
	private List<Visit> visits;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private PetType petType;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Pet(int id,String name, LocalDate dateOfBirth, PetType petType, List <Visit> visits) {
		this.id = id;
		this.name = name;
		this.petType = petType;
		this.visits = visits;
		this.dateOfBirth = dateOfBirth;
	}
	public Pet() {
		
	}
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public List<Visit> getVisits() {
		return visits;
	}
	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
