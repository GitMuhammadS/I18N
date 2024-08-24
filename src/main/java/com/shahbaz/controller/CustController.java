package com.shahbaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.shahbaz.model.Customer;

@Controller
public class CustController {
		
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/customer_register")
	public String showCustomerFormPage(@ModelAttribute("cust") Customer cust) {
		return "customer_registration";
	}
}
