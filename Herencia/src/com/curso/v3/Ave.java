package com.curso.v3;

public class Ave {

	String nombre;
	boolean vuelo;
	
	public Ave(String nombre, boolean vuelo, int edad) {
		super();
		this.nombre = nombre;
		this.vuelo = vuelo;
		this.edad = edad;
	}
	
	int edad;

	public void getDatos() {
		System.out.println(nombre + " " + vuelo + " " + edad);
	}

	void asignarNombre(String name) {
		nombre = name;
	}

}
