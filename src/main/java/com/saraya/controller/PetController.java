package com.saraya.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.saraya.model.Owner;
import com.saraya.model.Pet;
import com.saraya.service.OwnerService;
import com.saraya.service.PetService;
import com.saraya.service.PetTypeService;

@Controller
public class PetController {
	
	@Autowired
	PetService petservice;
	@Autowired
    private PetTypeService petTypeService;
	@Autowired
    private OwnerService ownerService;


	@RequestMapping(value="/listP")
	private String listPet(Model model) {
        model.addAttribute("pets", petservice.findAll());
        return "listP";
	}
	
	@RequestMapping(value="/newP", method= RequestMethod.GET)
	private String NewPet(Pet pet) {
      return "newP";
	}
	
	@RequestMapping(value = "/deletePet", method = RequestMethod.GET)
	public String removePet(@RequestParam int id){
		petservice.deletePet(id);
		return "redirect:/listP";
	}
	

   @RequestMapping(value="/newP", method= RequestMethod.POST)
   public ModelAndView newPet(@PathVariable("ownerId") int id, ModelAndView modelAndView){
       Pet pet = new Pet();
       Owner owner = ownerService.findOne(id);
       modelAndView.setViewName("pet/new");
       modelAndView.addObject("pet", pet);
       modelAndView.addObject("owner",owner);
       modelAndView.addObject("types", petTypeService.findAll());
       return modelAndView;

   }
   @RequestMapping(value = "/visitP", method = RequestMethod.GET)
	private String VisitPet(Pet pet) {
		return "visitP";
	}

	
}
