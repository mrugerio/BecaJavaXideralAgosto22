package com.curso.oo;

import java.util.Objects;

public class Pato{
	
	//Variable de instancia de clase u Objeto
	String nombre;
	int edad;
	boolean vuela;
	
	{
		System.out.println("Bloque inicializacion1");
	}
	
	//SobreCarga (Overloading)
	Pato() {
		System.out.println("Constructor Default");
	}
	
	Pato(String nombre) {
		this.nombre = nombre;
		System.out.println("Constructor con nombre");
	}

	Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		Pato other = (Pato) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	{
		System.out.println("Bloque inicializacion2");
	}
	
	
}
