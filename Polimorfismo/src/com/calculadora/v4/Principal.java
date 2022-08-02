package com.calculadora.v4;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		List<Operacion> listOpe = new ArrayList<>();
		
		listOpe.add(new Suma(8,4)); //0
		listOpe.add(new Div(8,4)); //1
		listOpe.add(new Resta(8,4)); //2
		listOpe.add(new Operacion(8,4)); //2
		
		ejecutaOperaciones(listOpe);
	}
	
	static void ejecutaOperaciones(
			         List<Operacion> listOperaciones) {
		for (Operacion ope:listOperaciones) { 
			System.out.println(ope.toString());
			System.out.println(ope.ejecuta());
		}
	}
}
