package com.calculadora.v3;

public class Suma extends Operacion {

	Suma(int x, int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x+y;
	}

	@Override
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}
	
	
}
