package com.curso.cliente;

import com.curso.Pato;

public class Cliente {

	public static void main(String[] args) {

		Pato pato1 = new Pato();
		
		pato1.nombre = "Donald";
		pato1.edad = 8;
		pato1.vuelo = true;
		
		System.out.println(pato1);
		
		Pato pato2 = new Pato();
		
		pato2.nombre = "Donald";
		pato2.edad = -500;
		pato2.vuelo = true;
		
		System.out.println(pato2);

		
		
	}

}
