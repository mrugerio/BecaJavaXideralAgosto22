package com.academy.beca.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
	
	@GetMapping("/Saludar")
	public String saludar() {
		return "Hola Mundo Rest";
	}
	
	

}
