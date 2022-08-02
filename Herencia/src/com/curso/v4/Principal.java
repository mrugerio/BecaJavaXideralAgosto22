package com.curso.v4;

import com.curso.v4.otro.Pinguino;

public class Principal {

	public static void main(String[] args) {

		Pato pato = new Pato();
		pato.setValores("Donald", true, 5);
		pato.getDatos();
		
		Pinguino pingui = new Pinguino();
		pingui.setValores("Pingu", false, 8);
		pingui.getDatos();
		
		
	}

}
