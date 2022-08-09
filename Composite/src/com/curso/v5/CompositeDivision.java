package com.curso.v5;

public class CompositeDivision extends ExpresionBinaria {

	public CompositeDivision(ComponentExpresion x, ComponentExpresion y) {
		super(x, y);
	}

	@Override
	public double getValor() {
		return ceIzquierda.getValor() / ceDerecha.getValor();
	}

}
