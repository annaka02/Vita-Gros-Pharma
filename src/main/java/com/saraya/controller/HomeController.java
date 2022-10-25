package com.saraya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
    @GetMapping("/home")
    public ModelAndView Home(ModelMap model) {
    	 ModelAndView modelAndView = new ModelAndView();
         modelAndView.setViewName("home");
         model.get("username");
         return modelAndView;
    }
    
}
