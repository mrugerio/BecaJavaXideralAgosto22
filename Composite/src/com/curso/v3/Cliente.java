package com.curso.v3;

import java.util.*;

public class Cliente {

	public static void main(String[] args) {
		
		List<ComponentExpresion> lista = new ArrayList<>();
		
		ComponentExpresion e1 = new LeafConstante(4.5);
		ComponentExpresion e2 = new LeafConstante(6.7);
		ComponentExpresion e3 = new LeafConstante(8.55);

		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		lista.add(new CompositeSuma(e1,e3)); 
		lista.add(new CompositeSuma(e2,e3));
		lista.add(new CompositeResta(e3,e3)); 
		lista.add(new CompositeResta(e2,e1));

		for (ComponentExpresion e:lista)
			System.out.println(e.getValor());
		
	}

}
