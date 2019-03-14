package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping()
public class login {
	
	 @RequestMapping("/login")
	 @ResponseBody
	    public ModelAndView initLogin(Model model){
	        
		 ModelAndView mv = new ModelAndView("login");     
		 return mv;  
	    }
}
