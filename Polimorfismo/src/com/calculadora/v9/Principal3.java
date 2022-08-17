package com.calculadora.v9;

import java.util.*;
import java.util.function.IntBinaryOperator;

public class Principal3 {

	public static void main(String[] args) {
		
		IntBinaryOperator suma = (x,y) -> x+y;
		IntBinaryOperator resta = (x,y) -> x-y;
		IntBinaryOperator multi = (x,y) -> x*y;
		IntBinaryOperator div = (x,y) -> {
			int res = -1000;
			try {
				res = x/y;
			}catch(ArithmeticException e) {
				System.out.println("No se puede dividir entre 0");
				throw new UnsupportedOperationException();
			}
			return res;
		};
		
		List<IntBinaryOperator> listOpe = new ArrayList<>();
		
		listOpe.add(suma); //0
		listOpe.add(div); //1
		listOpe.add(resta); //2
		listOpe.add(multi); //3

		ejecutaOperaciones(listOpe);
	}
	
	static void ejecutaOperaciones(
			List<IntBinaryOperator> listOperaciones) {
		for (IntBinaryOperator ope:listOperaciones) { 
		
			try {
				System.out.println(ope.applyAsInt(8, 4));
			}catch(UnsupportedOperationException e) {
				System.out.println("La división no se pudo realizar");
			}
		
			
		}
	}
}
