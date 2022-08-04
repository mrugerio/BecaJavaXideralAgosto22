package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Patrobas");
		
		bec1.setPc(new Mac("Sierra"));
		
		bec1.trabajar();
	}

}
