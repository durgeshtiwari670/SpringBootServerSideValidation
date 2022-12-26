package com.serversidevalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.serversidevalidation.entities.LoginData;


@Controller
public class MyController {

	@GetMapping("/form")
	public String openForm(Model model) {
		model.addAttribute("loginData",new LoginData());
		return "form";
	}
	
	//handler for processing form
	@PostMapping(value="/process")
	public String processForm(@ModelAttribute("loginData") LoginData logindata) {
		System.out.println(logindata);
		
		return "success";
	}
}
