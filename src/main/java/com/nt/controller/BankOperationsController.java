package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankOperationsController {
	@RequestMapping("/")
public String showHome() {
	return "home1";
}
	
	
	@GetMapping("/offers")
public String showOffer() {
	return "offers";
}
	
	@GetMapping("/balance")
	public String showBalance() {
	return "show_balance";	
	}
	
	@GetMapping("/approveLoan")
	public String loans() {
		return "loan";
	}
	
	//for autherization failure
	@GetMapping("/denied")
	public String denied() {
		return "access_denied";
	}
}
