package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		int x=48;
		int y=0;
		
		int res =  ejecutaDivision(x,y);
		System.out.println("Resultado: "+res);
	}

	private static int ejecutaDivision(int x, int y) {
		return x/y;
	}
	

}
