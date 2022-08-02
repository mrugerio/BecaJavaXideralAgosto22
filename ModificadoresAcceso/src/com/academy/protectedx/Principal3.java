package com.academy.protectedx;

import com.curso.protectedx.Pato;

public class Principal3 extends Pato {

	public static void main(String[] args) {
		
		Pato pato = new Pato();
		//pato.nombre = "Lucas";
		//pato.volar();

		//Principal3 p3 = new Principal3();
		getComportamiento();
		
	}
	
	//Elementos static NO tienen acceso a elementos de Instancia u Objetos
	//Elementos de Instancia u Objetos SI tienen acceso a elementos static
	
	public static void getComportamiento() {
		System.out.println("Ejecuta Comportamiento");
		//nombre = "Donald";
		//volar();
		
	}

}
