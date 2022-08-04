package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Patrobas");
		bec1.setPcWindows(new PcWindows("XP"));
		
		bec1.trabajar();
	}

}
