package com.calculadora.v9;

import java.util.*;
import java.util.function.BinaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> suma = (x,y) -> x+y;
		BinaryOperator<Integer> resta = (x,y) -> x-y;
		BinaryOperator<Integer> multi = (x,y) -> x*y;
		BinaryOperator<Integer> div = (x,y) -> {
			int res = -1000;
			try {
				res = x/y;
			}catch(ArithmeticException e) {
				System.out.println("No se puede dividir entre 0");
				throw new UnsupportedOperationException();
			}
			return res;
		};
		
		List<BinaryOperator<Integer>> listOpe = new ArrayList<>();
		
		listOpe.add(suma); //0
		listOpe.add(div); //1
		listOpe.add(resta); //2
		listOpe.add(multi); //3

		ejecutaOperaciones(listOpe);
	}
	
	static void ejecutaOperaciones(
			List<BinaryOperator<Integer>> listOperaciones) {
		for (BinaryOperator<Integer> ope:listOperaciones) { 
		
			try {
				System.out.println(ope.apply(8, 0));
			}catch(UnsupportedOperationException e) {
				System.out.println("La división no se pudo realizar");
			}
		
			
		}
	}
}
