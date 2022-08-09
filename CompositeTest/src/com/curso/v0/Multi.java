package com.curso.v0;

public class Multi implements Expresion {
	
	Expresion left, right;

	public Multi(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public double getValor() {
		return left.getValor() / right.getValor();
	}

}
