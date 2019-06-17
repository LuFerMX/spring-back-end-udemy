package com.example.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.model.Persona;

@Controller
@RequestMapping("/ejemploTres")
public class ExampleTresController {

	private static final Log LOGGER = LogFactory.getLog(ExampleTresController.class);
	
	public static final String FORM_VIEW = "form";
	public static final String RESULT_VIEW = "result";
	
	/*
	 * Forma 1
	 * /
	@GetMapping("/")
	public String redirect() {
		return "redirect:/ejemploTres/show";
	}
	*/
	
	/*
	 * Forma 2
	 */
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("/ejemploTres/show");
	}
	
	
	@GetMapping("/show")
	public String showForm(Model mod) {
		mod.addAttribute("persona", new Persona());
		return FORM_VIEW;
	}

	@PostMapping("/addPersona")
	public ModelAndView addPersona(@Valid @ModelAttribute("persona") Persona persona, BindingResult binding) {
		LOGGER.info("METHOD: 'addPersona' -- PARAMS: '"+ persona + "'");
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		if( binding.hasErrors() ) {
			mav.setViewName(FORM_VIEW);
		} else {
			mav.setViewName(RESULT_VIEW);
			mav.addObject("persona", persona);
			
		}
		return mav;
	}
}
