package com.curso.v0;

public class Becario {
	
	private String nombre;
	private PcWindows pcWindows;
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	public PcWindows getPcWindows() {
		return pcWindows;
	}

	public void setPcWindows(PcWindows pcWindows) {
		this.pcWindows = pcWindows;
	}

	public void trabajar() {
		pcWindows.encender();
		System.out.println("Empezar a trabajar");
	}

}
