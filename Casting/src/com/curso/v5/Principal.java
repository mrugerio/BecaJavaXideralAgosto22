package com.curso.v5;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<Ave> listaAve = new ArrayList<>();
		
		listaAve.add(new AguilaCalva());
		listaAve.add(new AguilaCalva());
		listaAve.add(new AguilaReal());
		listaAve.add(new Aguila());
		
		for (Ave ave: listaAve ) {
			ave.volar();
			if (ave instanceof AguilaCalva) {
				System.out.println(((AguilaCalva)ave).tipo);
				((AguilaCalva)ave).volarAguilaCalva();
			}
			if (ave instanceof Aguila)
				System.out.println(((Aguila)ave).tipo);
			if (ave instanceof AguilaReal)
				System.out.println(((AguilaReal)ave).tipo);
			if (ave instanceof Object)
				System.out.println("soy un object");
			if (ave instanceof Ave)
				System.out.println("**soy un ave");
			System.out.println("*****");
		}
		

	}

}
