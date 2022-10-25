package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saraya.service.VetService;


@Controller
public class VetController {
	
	@Autowired
	private VetService vetservice;
	
	@RequestMapping(value="/listV", method= RequestMethod.GET)
    public String listVet(Model model) {
        model.addAttribute("vets", vetservice.findAll());
        return "listV";
    }

}
