package com.curso.v1;

public class Cliente {

	public static void main(String[] args) {

		ComponentExpresion e1 = new LeafConstante(4.5);
		ComponentExpresion e2 = new LeafConstante(6.7);
		ComponentExpresion e3 = new LeafConstante(8.55);
		ComponentExpresion e4 = new CompositeSuma(3.2,4.5);
		ComponentExpresion e5 = new CompositeSuma(6.2,3.8);
		ComponentExpresion e6 = new CompositeResta(3.2,4.5);
		ComponentExpresion e7 = new CompositeResta(6.2,3.8);

		
		System.out.println(e1.getValor()); //4.5
		System.out.println(e2.getValor()); //6.7
		System.out.println(e4.getValor()); //7.7
		System.out.println(e5.getValor()); //10.0
		System.out.println(e6.getValor()); //-1.3
		System.out.println(e7.getValor()); //2.4
		
		
	}

}
