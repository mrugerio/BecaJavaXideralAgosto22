package com.calculadora.v0;

public class Div extends Operacion {

	Div(int x, int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x/y;
	}
}
