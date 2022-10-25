package com.saraya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.saraya.model.vet;

@Service
public class VetService {
	
	 public static List<vet> lists = new ArrayList<>();
	    public static int id = 0;



	static {
        lists.add(new vet(1, "James Carter", "none"));
        lists.add(new vet(2,"linda Douglas", "dentistry surgery"));
        lists.add(new vet(3,"Sharon Jankins", "none"));
        lists.add(new vet(4,"Helen Leary", "radiology"));
        lists.add(new vet(5,"Rafael Ortega", "surgery"));
        lists.add(new vet(6,"Henry Stevens", "radiology"));
	}
	 public List<vet> findAll() {
	        return lists;
	    }


}
