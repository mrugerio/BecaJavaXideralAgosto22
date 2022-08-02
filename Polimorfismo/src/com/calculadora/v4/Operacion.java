package com.calculadora.v4;

public class Operacion {
	
	int x;
	int y;
	
	public Operacion(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int ejecuta(){
		return 0;
	}

	@Override
	public String toString() {
		//Se resuelve en tiempo de Ejecución.
		return this.getClass().getSimpleName()+
				"[x=" + x + ", y=" + y + "]";
	}
	

}
