package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saraya.service.PetTypeService;

@Controller
public class PetTypeController {
	
	 @Autowired
	    private PetTypeService petTypeService;
	 
		@RequestMapping(value="/newP")
         private String pettypeList(Model model) {
			model.addAttribute("types", petTypeService.findAll());
			return "list";
		}



}
