package com.curso.cliente.v2;

import com.curso.v2.Pato;

public class Cliente {

	public static void main(String[] args) {

		Pato pato1 = new Pato();
		
		pato1.asignarEdad(8);
		
		System.out.println(pato1.obtenerEdad());
		
		Pato pato2 = new Pato();
		
		pato2.asignarEdad(-500);
		
		System.out.println(pato2.obtenerEdad());

		
		
	}

}
