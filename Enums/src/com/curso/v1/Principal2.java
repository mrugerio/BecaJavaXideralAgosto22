package com.curso.v1;

public class Principal2 {

	public static void main(String[] args) {
		
		Estacion e = Estacion.PRIMAVERA;

		int numeroPersona = new Zoologico().contratarPersonal(e);
		
		System.out.println(numeroPersona);

	}

}
