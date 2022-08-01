package com.curso.statico;

import java.util.Objects;

public class Pato{
	
	//Variable de Instancia de clase u Objeto
	String nombre;
	int edad;
	
	//Variable de Clase
	static int contador;
	
	//SobreCarga (Overloading)
	Pato() {
		contador++; //contador = contador + 1
	}

	Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}

	//Método de instancia
	void volar() {
		System.out.println("No puedo volar");
	}
	
	static int getContador() {
		return contador;
	}
	
}
