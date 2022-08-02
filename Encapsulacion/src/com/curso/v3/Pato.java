package com.curso.v3;

public class Pato {

	private String nombre;
	private int edad;
	private boolean vuelo;
	
	@Override //SobreEscritura
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + ", vuelo=" + vuelo + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isVuelo() {
		return vuelo;
	}
	public void setVuelo(boolean vuelo) {
		this.vuelo = vuelo;
	}


}
