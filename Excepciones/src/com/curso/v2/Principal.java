package com.curso.v2;

public class Principal {
	
	public static void main(String[] args) {
		int x=48;
		int y=0;
		
		int res =  ejecutaDivision(x,y);
		System.out.println("Resultado: "+res);
		
	}

	private static int ejecutaDivision(int x, int y) {
		if (y==0)
			throw new CeroException("No se puede dividir entre 0");

		return x/y;
	}
	

}
