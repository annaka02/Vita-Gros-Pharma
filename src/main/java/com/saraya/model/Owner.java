package com.saraya.model;

import java.util.List;

public class Owner {

	 private int id;
	    private String firstName;
	    private  String lastName;
	    private  String address;
	    private String city;
	    private  String telephone;
	    private List <Pet> pets;

	    public Owner(int id, String firstName, String lastName, String address, String city, String telephone, List<Pet> pets) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.city = city;
	        this.telephone = telephone;
	        this.pets = pets;
	    }

	    public Owner(int id, String firstName, String lastName, String address, String city, String telephone) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.city = city;
	        this.telephone = telephone;
	    }

	    public Owner() {
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
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

	    public String getTelephone() {
	        return telephone;
	    }

	    public void setTelephone(String telephone) {
	        this.telephone = telephone;
	    }

	    public List<Pet> getPets() {
	       return pets;
	    }

	    public void setPets(List<Pet> pets) {
	        this.pets = pets;
	    }
		
		

}
