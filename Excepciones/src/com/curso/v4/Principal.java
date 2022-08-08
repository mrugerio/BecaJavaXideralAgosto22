package com.curso.v4;

public class Principal {

	public static void main(String[] args) throws CeroException  {
		int x = 48;
		int y = 0;

		int res;

		res = ejecutaDivision(x, y);
		System.out.println("Resultado: " + res);

	}

	private static int ejecutaDivision(int x, int y) throws CeroException {
		if (y == 0)
			throw new CeroException("No se puede dividir entre 0");
		return x / y;
	}

}
