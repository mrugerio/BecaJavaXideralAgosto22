package com.curso.v9;

public class Pato2 implements AutoCloseable {
	
	public static void main(String[] args) {
		try(Pato2 pato = new Pato2()) {
			System.out.println(pato);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		System.out.println("Continua con el programa");
	}


	@Override
	public void close() throws Exception {
		System.out.println("Cerrar Pato");
	}
	
	@Override
	public String toString() {
		return "Pato []";
	}

}
