package com.curso.v0;

public class PcWindows {
	
	String version;

	public PcWindows(String version) {
		this.version = version;
	}
	
	void encender(){
		System.out.println("Encender PcWindows "+
				version);
	}

}
