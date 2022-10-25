package com.saraya.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginController {
	 private Log logger = LogFactory.getLog(LoginController.class);

	    @GetMapping("/login")
	    public String login() {
	        return "login";
	    }

}
