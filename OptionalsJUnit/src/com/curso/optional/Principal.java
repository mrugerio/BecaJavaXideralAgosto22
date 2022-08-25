package com.curso.optional;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
				
		String name = "Patrobas";
	    name = Optional.ofNullable(name).orElse("John");
	    System.out.println(name.length());
	
	}

}
