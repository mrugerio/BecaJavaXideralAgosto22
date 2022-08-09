package com.curso.v4;

public class CompositeMultiplicacion implements ComponentExpresion {
	
	ComponentExpresion ceIzquierda;
	ComponentExpresion ceDerecha;
	
	public CompositeMultiplicacion(ComponentExpresion x, ComponentExpresion y) {
		ceIzquierda = x;
		ceDerecha = y;
	}

	@Override
	public double getValor() {
		return ceIzquierda.getValor() * ceDerecha.getValor();
	}

}
