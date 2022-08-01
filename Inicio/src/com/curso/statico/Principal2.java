package com.curso.statico;

public class Principal2 {

	public static void main(String[] args) {
		
		System.out.println(Pato.getContador());
		
		Pato pato1 = new Pato();
		pato1.volar();

		Pato pato2 = new Pato("Donald",5);
		//System.out.println(pato2.getContador());
		
		Pato pato3 = new Pato();
		pato3.volar();
		//System.out.println(pato3.getContador());
				
		System.out.println(Pato.getContador()); //3

	}

}
