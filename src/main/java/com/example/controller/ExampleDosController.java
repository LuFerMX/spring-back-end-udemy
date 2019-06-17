package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ejemploDos")
public class ExampleDosController {

	private static final String EXAMPLE2VIEW = "ejemplo2";
	
	@GetMapping("/respuesta1")
	public ModelAndView respuesta1(@RequestParam(name="nm", required=false, defaultValue="?nm=NOMBRE") String nombre ) {
		ModelAndView mav = new ModelAndView(EXAMPLE2VIEW);
		mav.addObject("nm_nombre", nombre);
		
		return mav;
	}
	
	@GetMapping("/respuesta2/{nm}")
	public ModelAndView respuesta2(@PathVariable("nm") String nombre) {
		ModelAndView mav = new ModelAndView(EXAMPLE2VIEW);
		mav.addObject("nm_nombre", nombre);
		
		return mav;
	}
}
