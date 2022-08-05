package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		Ropa ropa1 = new Vestido(new Lavar());
		generarAccion(ropa1);
		Ropa ropa2 = new Camisa(new Planchar());
		generarAccion(ropa2);
		
	}
	
	private static void generarAccion(Ropa ropa) {
		ropa.fabricar();
		ropa.vender();
		if (ropa instanceof Vestido)
			((Vestido)ropa).getAccionRopa().aplicar();
		if (ropa instanceof Camisa)
			((Camisa)ropa).getAccionRopa().aplicar();
		ropa.desechar();
		System.out.println("***");
	}

}
