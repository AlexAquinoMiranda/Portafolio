package com.portafolio.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("portafolioAle")
@RequestMapping("/portafolioAle")
public class PortafolioController {
	
	
	@RequestMapping(value = "/home")
	public String home(Map<String, Object> model) {

		model.put("inicio", "Login");
		model.put("crear", "Register");
		model.put("titulo", "INICIO DE SESIÓN");
		return "home";
	}

}
