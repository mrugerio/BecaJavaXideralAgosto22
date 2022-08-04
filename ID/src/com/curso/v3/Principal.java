package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		Becario bec1 = new Becario("Patrobas");
		bec1.setPc(new PcWindows("Vista"));
		bec1.trabajar();
	}

}
