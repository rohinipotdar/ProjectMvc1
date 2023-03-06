package com.BikkadIT.SpringMvcSecondApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	public HelloController() {
		super();
		System.out.println("Hello Class controller");
					
	}

	@GetMapping("/helloworld")
	public ModelAndView hellomsg() {
		
		String msg = "Hello World";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("MSG",msg);
		mav.setViewName("hello");
		
		return mav;
	}
	
	
}
