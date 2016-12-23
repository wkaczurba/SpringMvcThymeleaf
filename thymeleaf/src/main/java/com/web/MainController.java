package com.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/", method=GET)
	public String main() {
		return "index";
	}
	
	@RequestMapping(value="/register", method=GET)
	public String register() {
		return "form";
	}
	
	@RequestMapping(value="/register", method=POST)
	public String processRegistration() {
		return "redirect:/";
	}
	// TODO: mappings etc.
}
