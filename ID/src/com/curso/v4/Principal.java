package com.curso.v4;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Becario bec1 = new Becario("Patrobas");
		Pc pc = obtenerPc();
		bec1.setPc(pc);
		System.out.println("Version:"+pc.version);
		System.out.println(pc.getClass().getName());
		bec1.trabajar();
	}

	private static Pc obtenerPc() {
		
		Pc[] arreglo = {new PcLinux("Ubuntu")
				,new PcWindows("XP"),new Mac("Sierra")};
		
		int i = new Random().nextInt(arreglo.length);
		
		return arreglo[i];
	}
	
	
	

}
