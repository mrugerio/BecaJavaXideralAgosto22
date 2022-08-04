package com.curso.v1;

public class Becario {
	
	private String nombre;
	private PcWindows pcWindows;
	private PcLinux pcLinux; //NO SE DEBE HACER
	//private Mac mac;
	
	public PcLinux getPcLinux() {
		return pcLinux;
	}

	public void setPcLinux(PcLinux pcLinux) {
		this.pcLinux = pcLinux;
	}

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
		//switch
		pcWindows.encender();
		System.out.println("Empezar a trabajar");
	}

}
