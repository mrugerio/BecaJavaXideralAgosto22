package com.curso.v4;

public class PcWindows extends Pc{ //IS-A

	public PcWindows(String version) {
		super(version);
	}
	
	public void encender(){
		System.out.println("Encender PcWindows "+
				version);
	}

}
