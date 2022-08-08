package com.curso.v8;

public class Principal {

	public static void main(String[] args)  {
		int x = 48;
		int y = 1005;

		int res;

		try {
			res = ejecutaDivision(x, y);
			System.out.println("Resultado: " + res);
		} catch (CeroException | NegativoException | UnsupportedOperationException e ) {
			e.printStackTrace();
		}
		finally { //OPCIONAL
			System.out.println("Paso por finally");
		}
		System.out.println("Programa continua.");
	}

	private static int ejecutaDivision(int x, int y) throws CeroException, NegativoException {
		if (y == 0)
			throw new CeroException("No se puede dividir entre 0");
		else if (y < 0)
			throw new NegativoException("Y no puede ser negativo");
		if (y>1000) {
			throw new UnsupportedOperationException("y no puede ser mayor a 1000");
		}
		return x / y;
	}

}
