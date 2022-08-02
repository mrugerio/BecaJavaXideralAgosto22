package com.calculadora.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Operacion ope0 = new Operacion(8,4);
		Operacion ope1 = new Suma(8,4);		
		Operacion ope2 = new Div(8,4);
		Operacion ope3 = new Resta(8,4);

		//ArrayList tiene tamaño dinamico
		List<Operacion> listOpe = new ArrayList<>();
		
		listOpe.add(ope1); //0
		listOpe.add(ope2); //1
		listOpe.add(ope3); //2
		listOpe.add(ope0); //3
		
		ejecutaOperaciones(listOpe);
	}
	
	static void ejecutaOperaciones(
			         List<Operacion> listOperaciones) {
		for (int x=0; x<listOperaciones.size();x++) {
			Operacion o = listOperaciones.get(x);
			System.out.println(o);
			int i = o.ejecuta();
			System.out.println(i);
		}
	}
}
