package com.curso.v4;

public class Mac extends Pc { //IS-A
	
	public Mac(String version) {
		super(version);
	}
	
	public void encender(){
		System.out.println("Encender Mac "+
				version);
	}

}
