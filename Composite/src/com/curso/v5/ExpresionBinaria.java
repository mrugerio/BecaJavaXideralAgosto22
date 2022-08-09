package com.curso.v5;

public abstract class ExpresionBinaria 
					implements ComponentExpresion {

	ComponentExpresion ceIzquierda;
	ComponentExpresion ceDerecha;
	
	public ExpresionBinaria(ComponentExpresion x, ComponentExpresion y) {
		ceIzquierda = x;
		ceDerecha = y;
	}

}
