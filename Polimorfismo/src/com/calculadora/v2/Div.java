package com.calculadora.v2;

public class Div extends Operacion {

	Div(int x, int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x/y;
	}
	
	@Override
	public String toString() {
		return "Division [x=" + x + ", y=" + y + "]";
	}
}
