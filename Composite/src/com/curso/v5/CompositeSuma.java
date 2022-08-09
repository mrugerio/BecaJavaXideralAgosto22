package com.curso.v5;

public class CompositeSuma extends ExpresionBinaria {
	
	public CompositeSuma(ComponentExpresion x, ComponentExpresion y) {
		super(x,y);
	}

	@Override
	public double getValor() {
		return ceIzquierda.getValor() + ceDerecha.getValor();
	}

}
