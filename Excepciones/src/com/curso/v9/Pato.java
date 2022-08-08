package com.curso.v9;

public class Pato implements AutoCloseable {
	
	public static void main(String[] args) {
		
		Pato pato = new Pato();;
		try {
			System.out.println(pato);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if ( pato != null) {
				try {
					pato.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
