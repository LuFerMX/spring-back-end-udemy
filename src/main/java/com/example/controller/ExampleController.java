package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.component.EjemploComponent;
import com.example.service.IEjemploService;

@Controller
@RequestMapping("/example")
public class ExampleController {

	private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);
	public static final String EXAMPLE_VIEW = "hola";
	
	@Autowired
	@Qualifier("ejemploService")
	private IEjemploService ejemploService;
	
	@Autowired
	@Qualifier("ejemploComponent")
	private EjemploComponent exaComponent;
	
	@RequestMapping(value="/returnView", method=RequestMethod.GET)
	public String exampleString(Model model) {
		exaComponent.sayHello();
		LOG.info("");
		model.addAttribute("personas",  ejemploService.getListPersona());
		return EXAMPLE_VIEW;
	}
	
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mod = new ModelAndView(EXAMPLE_VIEW);
		mod.addObject("personas", ejemploService.getListPersona());
		return mod;
	}
	
	

}
