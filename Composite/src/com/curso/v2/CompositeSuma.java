package com.curso.v2;

public class CompositeSuma implements ComponentExpresion {
	
	double x;
	double y;
	
	public CompositeSuma(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getValor() {
		return x+y;
	}

}
