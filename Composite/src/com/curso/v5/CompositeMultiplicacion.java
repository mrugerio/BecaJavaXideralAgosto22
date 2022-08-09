package com.curso.v5;

public class CompositeMultiplicacion extends ExpresionBinaria {

	public CompositeMultiplicacion(ComponentExpresion x, ComponentExpresion y) {
		super(x, y);
	}

	@Override
	public double getValor() {
		return ceIzquierda.getValor() * ceDerecha.getValor();
	}

}
