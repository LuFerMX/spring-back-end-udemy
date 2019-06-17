package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ejemplo4")
public class EjemploCuatroController {

	public static final String VIEW_404 = "404";
	public static final String VIEW_500 = "500";
	
	@GetMapping("/404")
	public String viewError() {
		return VIEW_404;
	}
	
	@GetMapping("/500")
	public ModelAndView view500() {
		ModelAndView mav = new ModelAndView(VIEW_500);
		
		return mav;
	}
	
}
