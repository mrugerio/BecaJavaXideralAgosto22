package com.curso;

public class Principal4 {

	public static void main(String[] args) {
		
		String nombre = "Andronico";

		for (int x=0; x<10; x++) {
			nombre = nombre + x;
			System.out.println(nombre);
		}
		System.out.println("*************");
		
		StringBuilder otroNombre = new StringBuilder("Andronico");

		for (int x=0; x<10; x++) {
			otroNombre = otroNombre.append(x);
			System.out.println(otroNombre);
		}
		
	}

}
