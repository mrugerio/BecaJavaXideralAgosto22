package com.curso.v6;

public class Principal {

	public static void main(String[] args) {

		Ave ave = new Aguila();
		//ave.volar();
		//((Aguila)ave).volarAguila();
		
		AguilaReal ave1 = new AguilaReal();
		//ave1.volarAguilaReal();
		Aguila ave2 = ave1;
		ave2.volarAguila();
		
		
	}

}
