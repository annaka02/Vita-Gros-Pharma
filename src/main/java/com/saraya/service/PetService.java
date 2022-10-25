package com.saraya.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.model.Owner;
import com.saraya.model.Pet;
import com.saraya.model.PetType;
import com.saraya.model.Visit;


@Service
public class PetService {
	
	 public static List<Pet> list = new ArrayList<Pet>();
	    public static int count = 13;

	    @Autowired
	    private OwnerService ownerService;


	
	 public List<Pet> findAll() {
	       Iterator<Owner> iterator = ownerService.findAll().iterator();
	       while (iterator.hasNext()) {
	           Owner owner = iterator.next();
	           for (Pet pet : owner.getPets()) {
	             list.add(pet);
	            }
	        }
	        return list;
	    }
		public void addPet(String name, LocalDate dateOfBirth, PetType petType, List <Visit >visits) {
			list.add(new Pet(++count, name, dateOfBirth, petType, visits));
		}


		public void deletePet(int id) {
			Iterator<Pet> idIter = list.iterator();
			while(idIter.hasNext()) {
				Pet pet = idIter.next();
				if(pet.getId() == id) {
					idIter.remove();
				}
			}
		}

}
