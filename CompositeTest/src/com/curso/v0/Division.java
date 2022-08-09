package com.curso.v0;

public class Division implements Expresion {
	
	Expresion left, right;

	public Division(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public double getValor() {
		return left.getValor() / right.getValor();
	}

}
