package com.saraya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.saraya.model.PetType;


@Service
public class PetTypeService {
	
    public static List<PetType> list = new ArrayList<>();
    
    static {
        list.add(new PetType("Bird"));
        list.add(new PetType("Cat"));
        list.add(new PetType("Dog"));
        list.add(new PetType("Hamster"));
        list.add(new PetType("Lizzard"));
        list.add(new PetType("Rabit"));

    }
    @Autowired 
    OwnerService ownerservice;
    
    public List<PetType> findAll() {
    	return list;
    }
    
    public PetType save(String name) {
        PetType petTypeCreated = new PetType(name);
        list.add(petTypeCreated);
        return petTypeCreated;
    }

	

}


