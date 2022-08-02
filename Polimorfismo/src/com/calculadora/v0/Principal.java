package com.calculadora.v0;

public class Principal {

	public static void main(String[] args) {
		Suma suma = new Suma(8,4);
		System.out.println(suma.ejecuta());
		
		Div div = new Div(8,4);
		System.out.println(div.ejecuta());


	}
}
