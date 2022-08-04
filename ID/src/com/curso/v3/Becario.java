package com.curso.v3;

public class Becario  { 
	
	private String nombre;
	private Pc pc; //HAS-A 
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	public Pc getPc() {
		return pc;
	}

	public void setPc(Pc pc) {
		this.pc = pc;
	}

	public void trabajar() {
		pc.encender(); //Polimorfismo
		System.out.println("Empezar a trabajar");
	}

}
