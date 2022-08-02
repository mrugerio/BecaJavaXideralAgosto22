package com.calculadora.v6;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		List<Operacion> listOpe = new ArrayList<>();
		
		listOpe.add(new Suma(8,4)); //0
		listOpe.add(new Div(8,4)); //1
		listOpe.add(new Resta(8,4)); //2
		listOpe.add(new Multi(8,4)); //3
		listOpe.add(new Multi(9,6)); //4

		ejecutaOperaciones(listOpe);
	}
	
	static void ejecutaOperaciones(
			         List<Operacion> listOperaciones) {
		for (Operacion ope:listOperaciones) { 
			System.out.println(ope);
			System.out.println(ope.ejecuta());
		}
	}
}
