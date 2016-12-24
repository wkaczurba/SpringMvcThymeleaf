package com.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	// TODO: Add UserRepository

	@RequestMapping(value="/", method=GET)
	public String main() {
		return "index";
	}
	
	@RequestMapping(value="/register", method=GET)
	public String register() {
		return "form";
	}
	
	@RequestMapping(value="/register", method=POST)
	public String processRegistration(Form form) {
		// TODO: Form validation.
		// TODO: Add repo class, so it saves data and can be tested.

		System.out.println("processRegistration called.");
		return "redirect:/registered";
	}
	
	@RequestMapping(value="/registered", method=GET)
	public String registered() {
		return "registered";
	}
}
