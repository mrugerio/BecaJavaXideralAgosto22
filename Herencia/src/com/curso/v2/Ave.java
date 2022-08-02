package com.curso.v2;

public class Ave {

	String nombre;
	boolean vuelo;
	int edad;

	public void getDatos() {
		System.out.println(nombre + " " + vuelo + " " + edad);
	}

	void asignarNombre(String name) {
		nombre = name;
	}

}
