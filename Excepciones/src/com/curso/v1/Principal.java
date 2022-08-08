package com.curso.v1;

public class Principal {
	
	public static void main(String[] args) {
		int x=48;
		int y=0;
		
		try {
			int res =  ejecutaDivision(x,y);
			System.out.println("Resultado: "+res);
		}catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
			e.printStackTrace();
		}finally {
			System.out.println("Entro Finally");
		}
		System.out.println("Programa continua");

	}

	private static int ejecutaDivision(int x, int y) {
		return x/y;
	}
	

}
