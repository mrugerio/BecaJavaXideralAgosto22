package com.curso.privado;

public class Pato {
	
	private String nombre;
	
	private void volar() {
		System.out.println(nombre +" no puedo volar");
	}
	
	public Pato(String nombre) {
		this.nombre = nombre;
	}
	
	public void getVolar() {
		volar();
	}

}
