package com.curso.v0;

public class Resta implements Expresion {

	Expresion left, right;

	public Resta(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public double getValor() {
		return left.getValor() - right.getValor();
	}


}
