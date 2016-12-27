package com.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import org.springframework.validation.Errors;

@Controller
public class MainController {
	
	// TODO: Add UserRepository

	@RequestMapping(value="/", method=GET)
	public String main() {
		return "index";
	}
	
	@RequestMapping(value="/register", method=GET)
	public String register(Model model) {
		//model.addAttribute("userform", new UserForm());
		//model.addAttribute("userform", new UserForm());
		model.addAttribute(new UserForm());
		return "form";
	}
	
	@RequestMapping(value="/register", method=POST)
	public String processRegistration(@Valid UserForm userform, Errors errors) {
		// TODO: Form validation.
		if (errors.hasErrors()) {
			return "form";
		}
		// TODO: Add repo class, so it saves data and can be tested.

		System.out.println("processRegistration called.");
		return "redirect:/registered";
	}
	
	@RequestMapping(value="/registered", method=GET)
	public String registered() {
		return "registered";
	}
}
