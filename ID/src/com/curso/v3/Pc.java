package com.curso.v3;

public abstract class Pc {
	
	String version;
	
	public Pc(String version) {
		this.version = version;
	}

	abstract void encender();
}
