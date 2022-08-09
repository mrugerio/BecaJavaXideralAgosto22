package com.curso.v5;

import java.util.*;

public class Cliente {

	public static void main(String[] args) {
				
		ComponentExpresion e1 = new LeafConstante(2.0);
		ComponentExpresion e2 = new LeafConstante(3.0);
		ComponentExpresion e3 = new LeafConstante(4.0);
		ComponentExpresion e4 = new LeafConstante(5.0);
		
		ComponentExpresion e5 = new CompositeResta(e1,e2);
		ComponentExpresion e6 = new CompositeSuma(e3,e4);

		ComponentExpresion e7 = new CompositeSuma(e5,e6);

		System.out.println(e7.getValor());
		
		ComponentExpresion e = new CompositeSuma(
				new CompositeResta(
						new LeafConstante(2.0)
						,
						new LeafConstante(3.0)
						)
				,new CompositeSuma(
						new LeafConstante(4.0)
						,
						new LeafConstante(5.0)
						)
				);
		
		System.out.println("Version compleja: "+e.getValor());
		
		System.out.println("*************");
		
		ComponentExpresion eraiz = new CompositeDivision(
				new CompositeMultiplicacion(
						new CompositeResta(
								new LeafConstante(4),
								new LeafConstante(6)
						),
						new LeafConstante(200)
				)
				,
				new CompositeSuma(
						new LeafConstante(3),
						new LeafConstante(83)
				)	
		);
		System.out.println(eraiz.getValor());
	}

}
