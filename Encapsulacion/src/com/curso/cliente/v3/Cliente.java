package com.curso.cliente.v3;

import com.curso.v3.Pato;

public class Cliente {

	public static void main(String[] args) {

		Pato pato1 = new Pato();
		pato1.setNombre("Donald");
		pato1.setEdad(8);
		pato1.setVuelo(false);
		
		System.out.println(pato1.getNombre());
		
		Pato pato2 = new Pato();
		pato2.setNombre("Lucas");
		pato2.setEdad(-500);
		pato2.setVuelo(true);
		
		System.out.println(pato2.isVuelo());

		
		
	}

}
