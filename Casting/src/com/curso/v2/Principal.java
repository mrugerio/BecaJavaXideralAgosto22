package com.curso.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		AguilaReal ave1 = new AguilaReal();
		Aguila ave4 = (Aguila)ave1;
		System.out.println("Tipo: "+ave4.tipo);
		
		Ave ave5 = (Ave)ave1;
		
		List<Ave> listaAves = new ArrayList<>();
		listaAves.add(ave1);//0
		listaAves.add(ave4);//1
		listaAves.add(ave5);//2
		
		System.out.println(listaAves.get(1).tipo);
		
		for(Ave ave:listaAves) {
			System.out.println(ave.tipo);
			ave.volar();
		}
	}

}
