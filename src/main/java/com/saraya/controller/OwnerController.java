package com.saraya.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.Owner;
import com.saraya.service.OwnerService;

@Controller

public class OwnerController {
	
	@Autowired
	private OwnerService ownerservice;

	@RequestMapping(value="/list", method= RequestMethod.GET)
    public String listOwner(Model model) {
        model.addAttribute("owners", ownerservice.findAll());
        return "list";
    }
	
	@RequestMapping(value="/search", method= RequestMethod.GET)
    public String Search(@RequestParam int id, Model model) {
        model.addAttribute("owner", ownerservice.findOne(id));
        return "searchO";
    }
	@RequestMapping(value="/editO" , method = RequestMethod.GET)
	public String addOwner(Owner owner) {
		return "editO";
	}
	
	@RequestMapping(value="/editO" , method = RequestMethod.POST)
	public String ownerAdded(@Valid Owner owner, BindingResult result) {
		if(result.hasErrors())
			return "editO";
		ownerservice.addOwner(owner.getFirstName(), owner.getLastName(), owner.getAddress(), owner.getCity(), owner.getTelephone());
		return "redirect:/list";
	}
	@RequestMapping(value = "/deleteOwner", method = RequestMethod.GET)
	public String removeOwner(@RequestParam int id){
		ownerservice.deleteOwner(id);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/updateOwner", method = RequestMethod.GET)
	public String updateOwner(@RequestParam int id, ModelMap model) {
		model.addAttribute("owner", ownerservice.getOwner(id));
		return "editO";
	}
	@RequestMapping(value="/updateOwner", method = RequestMethod.POST)
	public String updateTodo(@Valid Owner owner, BindingResult result) {
		   if(result.hasErrors())
		   return "editO";
		ownerservice.updateOwner(owner);
		return "redirect:/list";
	}
	@RequestMapping(value="/detailsOwner", method = RequestMethod.GET)
	public String detailsOwner(@RequestParam int id, ModelMap model) {
		model.addAttribute("owner", ownerservice.findOne(id));
		return "detailsO";
	}

}

