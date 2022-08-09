package com.curso.v2;

import java.util.*;

public class Cliente {

	public static void main(String[] args) {
		
		List<ComponentExpresion> lista = new ArrayList<>();

		lista.add(new LeafConstante(4.5));
		lista.add(new LeafConstante(6.7));
		lista.add(new LeafConstante(8.55));
		lista.add(new CompositeSuma(3.2,4.5));
		lista.add(new CompositeSuma(6.2,3.8));
		lista.add(new CompositeResta(3.2,4.5));
		lista.add(new CompositeResta(6.2,3.8));

		for (ComponentExpresion e:lista)
			System.out.println(e.getValor());
		
		
		
	}

}
