package com.curso.publico;

public class Pato {
	
	//A partir de Java 9 con Modularity
	//Public solo para el Módulo
	//Public para Módulos Amigos
	//Public para todo Mundo
	
	public String nombre;
	
	public void volar() {
		System.out.println(nombre +" no puedo volar");
	}

}
