package com.curso.v7;

import java.io.PrintStream;

public class Principal {

	public static void main(String[] args)  {
		int x = 48;
		int y = 1001;

		int res;

		try {
			res = ejecutaDivision(x, y);
			System.out.println("Resultado: " + res);
		} catch (CeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}finally { //OPCIONAL
			System.out.println("Paso por finally");
		}
		System.out.println("Programa continua.");
		
		
	}

	private static int ejecutaDivision(int x, int y) throws CeroException, NegativoException {
		if (y == 0)
			throw new CeroException("No se puede dividir entre 0");
		else if (y < 0)
			throw new NegativoException("Y no puede ser negativo");
		else if (y > 1000)
			throw new UnsupportedOperationException("Y no puede ser mayor a 1000");
		return x / y;
	}

}
