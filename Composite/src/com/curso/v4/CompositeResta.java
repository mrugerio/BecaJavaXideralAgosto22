package com.curso.v4;

public class CompositeResta implements ComponentExpresion {
	
	ComponentExpresion ceIzquierda;
	ComponentExpresion ceDerecha;
	
	public CompositeResta(ComponentExpresion x, ComponentExpresion y) {
		ceIzquierda = x;
		ceDerecha = y;
	}

	@Override
	public double getValor() {
		return ceIzquierda.getValor() - ceDerecha.getValor();
	}

}
