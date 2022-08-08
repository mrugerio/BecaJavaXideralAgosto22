package com.curso.v3;

public class Principal {
	
	public static void main(String[] args) {
		int x=48;
		int y=0;
		
		int res ;
		try {
			res = ejecutaDivision(x,y);
			System.out.println("Resultado: "+res);
		} catch (CeroException e) {
			e.printStackTrace();
			System.out.println("Termina Programa");
		}
		
	}

	private static int ejecutaDivision(int x, int y) throws CeroException {
		if (y==0)
			throw new CeroException("No se puede dividir entre 0");
		return x/y;
	}
	

}
