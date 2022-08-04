package com.curso.v2;

public class PcLinux implements Pc { //IS-A
	
	String version;

	public PcLinux(String version) {
		this.version = version;
	}
	
	public void encender(){
		System.out.println("Encender PcLinux "+
				version);
	}

}
