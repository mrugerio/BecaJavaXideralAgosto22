package com.calculadora.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Operacion ope1 = new Suma(8,4);		
		Operacion ope2 = new Div(8,4);
		Operacion ope3 = new Resta(8,4);
		Operacion ope4 = new Operacion(8,4);

		List<Operacion> listOpe = new ArrayList<>();
		
		listOpe.add(ope1); //0
		listOpe.add(ope2); //1
		listOpe.add(ope3); //2
		listOpe.add(ope4); //2
		
		ejecutaOperaciones(listOpe);
	}
	
	static void ejecutaOperaciones(
			         List<Operacion> listOperaciones) {
		for (Operacion ope:listOperaciones) { //ForEach
			System.out.println(ope);
			//int i = ope.ejecuta();
			System.out.println(ope.ejecuta());
		}
	}
}
