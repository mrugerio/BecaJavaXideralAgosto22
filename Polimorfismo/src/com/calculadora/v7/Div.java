package com.calculadora.v7;

public class Div implements Operacion {

	int x;
	int y;
	
	public Div(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Division:[x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public int ejecuta(){
		return x/y;
	}
}
