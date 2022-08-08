package com.curso.v6;

public class Principal {

	public static void main(String[] args)  {
		int x = 48;
		int y = -5;

		int res;

		try {
			res = ejecutaDivision(x, y);
			System.out.println("Resultado: " + res);
		} catch (Exception e) { //Esto es muy generico, es mejor ser Especifico
			e.printStackTrace();
		}finally { //OPCIONAL
			System.out.println("Paso por finally");
		}
		System.out.println("Programa continua.");
	}

	private static int ejecutaDivision(int x, int y) throws Exception {
		if (y == 0)
			throw new CeroException("No se puede dividir entre 0");
		else if (y < 0)
			throw new NegativoException("Y no puede ser negativo");
		return x / y;
	}

}
