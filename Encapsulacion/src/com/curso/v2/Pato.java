package com.curso.v2;

public class Pato {

	private String nombre;
	private int edad;
	private boolean vuelo;
	
	//getter //obtener valor
	public int obtenerEdad() {
		//Validar que el usuario tenga rol de Admin
		return edad;
	}

	//setter //asignar valor
	public void asignarEdad(int edad) {
		if (edad >= 0)
			this.edad = edad;
		else
			System.out.println("La edad debe ser mayor a 0");
	}
	
	@Override //SobreEscritura
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + ", vuelo=" + vuelo + "]";
	}
	
	

}
