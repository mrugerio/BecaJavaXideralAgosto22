package com.curso.v2;

public class PcWindows implements Pc{ //IS-A
	
	String version;

	public PcWindows(String version) {
		this.version = version;
	}
	
	public void encender(){
		System.out.println("Encender PcWindows "+
				version);
	}

}
