package com.curso.v5;

public class CompositeResta extends ExpresionBinaria {
		
	public CompositeResta(ComponentExpresion x, ComponentExpresion y) {
		super(x,y);
	}

	@Override
	public double getValor() {
		return ceIzquierda.getValor() - ceDerecha.getValor();
	}

}
