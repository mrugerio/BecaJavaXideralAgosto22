package com.curso.v4;

public class Ave {

	protected String nombre;
	protected boolean vuelo;
	protected int edad;
	
	public Ave(String nombre, boolean vuelo, int edad) {
		super();
		this.nombre = nombre;
		this.vuelo = vuelo;
		this.edad = edad;
	}

	public void getDatos() {
		System.out.println(nombre + " " + vuelo + " " + edad);
	}

	void asignarNombre(String name) {
		nombre = name;
	}

}
