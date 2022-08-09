package com.curso.v1;

public class CompositeResta implements ComponentExpresion {
	
	double x;
	double y;
	
	public CompositeResta(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getValor() {
		return x-y;
	}

}
