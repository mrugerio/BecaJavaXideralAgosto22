package com.curso.statico;

import java.util.Objects;

public class Pato{
	
	static {
		System.out.println("Soy un bloque static 1");
	}
	
	//Variable de Instancia de clase u Objeto
	String nombre;
	int edad;
	
	//Variable de Clase
	static int contador;
	
	//SobreCarga (Overloading)
	Pato() {
		contador++; //contador = contador + 1
		System.out.println("Paso por constructor Default");
	}

	Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	{
		System.out.println("Soy un bloque de Instancia");
	}

	//Método de instancia
	void volar() {
		System.out.println("No puedo volar");
	}
	
	static int obtenerContador() {
		return contador;
	}
	
	static {
		System.out.println("Soy un bloque static 2");
	}
	
}
