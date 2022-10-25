package com.saraya.service;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.Owner;
import com.saraya.model.Pet;
import com.saraya.model.PetType;
import com.saraya.model.Visit;


@Service
public class OwnerService {

	
	 public static List<Owner> list = new ArrayList<>();
	    public static int id = 0;
	    public static int count = 10;
	    public static List<Pet> petList1 = new ArrayList<>();
	    public static List<Pet> petList2 = new ArrayList<>();
	    public static List<Pet> petList3 = new ArrayList<>();
	    public static List<Pet> petList4 = new ArrayList<>();
	    public static List<Pet> petList5 = new ArrayList<>();
	    public static List<Pet> petList6 = new ArrayList<>();
	    public static List<Pet> petList7 = new ArrayList<>();
	    public static List<Pet> petList8 = new ArrayList<>();
	    public static List<Pet> petList9 = new ArrayList<>();
	    public static List<Pet> petList10 = new ArrayList<>();


	    public static List<Visit> visitList = new ArrayList<>();
	    static {
	    	visitList.add(new Visit(LocalDate.of(2022, 01, 02), ""));
	    }

	    
	    static {
	        list.add(new Owner(1,"George", "Franklin", "110 W Liberty St.", "Madison", "6085546712", petList1));
	        list.add(new Owner(2,"Betty", "Davis", "638 Cardinal Ave.", "Sun Prairie", "6085546712", petList2));
	        list.add(new Owner(3,"Eduardo", "Rodriquez", "2693 Commerce St.", "MacFarland", "6085546712", petList3));
	        list.add(new Owner(4,"Harold", "Davis", "536 Friendly St.", "Windsor", "6085546712", petList4));
	        list.add(new Owner(5,"Peter", "McTavish", "2387 S. Fair Way", "Madison", "6085546712", petList5));
	        list.add(new Owner(6,"Jean", "Coleman", "105 NLake-St.", "Monoma", "6085546712", petList6));
	        list.add(new Owner(7,"Jeff", "Black", "1450 Oak Blvd.", "Monoma", "6085546712", petList7));
	        list.add(new Owner(8,"Maria", "Escobito", "345 Maple St.", "Madison", "6085546712", petList8));
	        list.add(new Owner(9,"David", "Shroeder", "2749 Blackawk Trail.", "Madison", "6085546712", petList9));
	        list.add(new Owner(10,"Carlos", "Estaban", "2335 Independence La.", "Madison", "6085546712", petList10));
	    }
	    static {
	        petList1.add(new Pet(1, "Leo", LocalDate.of(2022, 1, 13), new PetType("Bird"), visitList));
	        petList2.add(new Pet(2,"Basil", LocalDate.of(2022, 2, 14), new PetType("Cat"), visitList));
	        petList3.add(new Pet(3,"Jewel", LocalDate.of(2022, 3, 15), new PetType("Dog"), visitList));
	        petList3.add(new Pet(4,"Rosy", LocalDate.of(2022, 4, 16), new PetType("Hamster"), visitList));
	        petList4.add(new Pet(5,"Iggy", LocalDate.of(2022, 5, 17), new PetType("Bird"), visitList));
	        petList5.add(new Pet(6,"George", LocalDate.of(2022, 6, 18), new PetType("Cat"), visitList));
	        petList6.add(new Pet(7,"Max", LocalDate.of(2022, 7, 19), new PetType("Dog"), visitList));
	        petList6.add(new Pet(8,"Samantha", LocalDate.of(2022, 8, 20), new PetType("Hamster"), visitList));
	        petList7.add(new Pet(9,"Lucky", LocalDate.of(2022, 9, 21), new PetType("Lizard"), visitList));
	        petList8.add(new Pet(10,"Mulligan", LocalDate.of(2022, 10, 22), new PetType("Bird"), visitList));
	        petList9.add(new Pet(11,"Freddy", LocalDate.of(2022, 11, 23), new PetType("Cat"), visitList));
	        petList10.add(new Pet(12,"Lucky", LocalDate.of(2022, 12, 24), new PetType("Dog"), visitList));
	        petList10.add(new Pet(13,"Sly", LocalDate.of(2022, 1, 11), new PetType("Dog"), visitList));
	    } 
	   

	   	    public List<Owner> findAll() {
	        return list;
	    }

	   	public void addOwner(String firstName, String lastName, String address, String city, String telephone) {
			list.add(new Owner(++count, firstName, lastName, address, city, telephone));
		}

	   	public void deleteOwner(int id) {
			Iterator<Owner> idIter = list.iterator();
			while(idIter.hasNext()) {
				Owner owner = idIter.next();
				if(owner.getId() == id) {
					idIter.remove();
				}
			}
		}
	   	
	   	public Owner getOwner(int id) {
			for(Owner owner : list) {
				if(owner.getId() == id) {
					return owner;
				}
				
			}
			return null;
		}

	   	public void updateOwner(Owner owner) {
			list.remove(owner);
			list.add(owner);
		}
	   	
	    public Owner findOne(int id) {
	        Owner owner = new Owner();
	        for (Owner o : list) {
	            if (o.getId() == id) {
	                owner = o;
	            }
	        }
	        return owner;
	    }



}
