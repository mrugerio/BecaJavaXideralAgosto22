package com.curso.v2;

public class Mac implements Pc { //IS-A
	
	String version;

	public Mac(String version) {
		this.version = version;
	}
	
	public void encender(){
		System.out.println("Encender Mac "+
				version);
	}

}
