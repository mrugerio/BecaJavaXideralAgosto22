package com.curso.v0;

public class Cliente {

	public static void main(String[] args) {

		ComponentExpresion e1 = new LeafConstante(4.5);
		ComponentExpresion e2 = new LeafConstante(6.7);
		ComponentExpresion e3 = new LeafConstante(8.55);

		System.out.println(e1.getValor()); //4.5
		System.out.println(e2.getValor()); //6.7

		
		
	}

}
