package com.curso.v0;

public class Suma implements Expresion {
	
	Expresion left, right;

	public Suma(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public double getValor() {
		return left.getValor() + right.getValor();
	}

}
