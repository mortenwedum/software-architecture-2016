package com.phase3.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.phase3.models.User;
import com.phase3.service.CreateUserService;
 
@Controller
@RequestMapping("/")

public class CreateUserController {
	 @Autowired
	    CreateUserService service;
	     
	    @Autowired
	    MessageSource messageSource;
	    
		@RequestMapping("/")
	    public ModelAndView index(HttpServletRequest request,HttpServletResponse res) {  

	            return new ModelAndView("index");  
	    }  
	 
	    @RequestMapping(value = {"/list" }, method = RequestMethod.GET)
	    public String listUsers(ModelMap model) {	 
	        List<User> user = service.findAllUsers();
	        model.addAttribute("user", user);
	        return "createuser";
	    }
	 
	    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	    public String newUser(ModelMap model) {
	        User user = new User();
	        model.addAttribute("user", user);
	        model.addAttribute("edit", false);
	        return "registration";
	    }
	 

	    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	    public String saveUser(@Valid User user, BindingResult result,
	            ModelMap model) {
	 
	        if (result.hasErrors()) {
	            return "registration";
	        }
	         
	        service.saveUser(user);
	 
	        model.addAttribute("success", "User " + user.getName() + " registered successfully");
	        return "success";
	    }
	 
}
