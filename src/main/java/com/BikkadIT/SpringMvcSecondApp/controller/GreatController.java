package com.BikkadIT.SpringMvcSecondApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreatController {

	@GetMapping("/GreatMsg")
	public String Grtmsg(Model model) {
		
		String gtmsg = "Hello Everyone";
		
		model.addAttribute("GREAT",gtmsg);
		return "greet";
		
		
	}
	
}
