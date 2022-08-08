package com.curso.v9;

public class Pato3 implements AutoCloseable {
	
	public static void main(String[] args) {
		try(Pato3 pato = new Pato3()) {
			System.out.println(pato);
		} 
		System.out.println("Continua con el programa");
	}


	@Override
	public void close() {
		System.out.println("Cerrar Pato");
	}
	
	@Override
	public String toString() {
		return "Pato []";
	}

}
