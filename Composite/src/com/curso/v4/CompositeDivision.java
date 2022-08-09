package com.curso.v4;

public class CompositeDivision implements ComponentExpresion {
	
	ComponentExpresion ceIzquierda;
	ComponentExpresion ceDerecha;
	
	public CompositeDivision(ComponentExpresion x, ComponentExpresion y) {
		ceIzquierda = x;
		ceDerecha = y;
	}

	@Override
	public double getValor() {
		return ceIzquierda.getValor() / ceDerecha.getValor();
	}

}
