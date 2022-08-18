package com.academy.beca.rest;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
	
	@Value("${coach.name}") 
	private String coachName;

	@Value("${team.name}") 
	private String teamName;
	
	@GetMapping("/Saludar")
	public String saludar() {
		return "Hola "+coachName + " ,"+teamName;
	}
	
	

}
