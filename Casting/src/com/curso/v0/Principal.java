package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		//Para atributos prevalece la Referencia
		//Para metodos prevalece el objeto
		AguilaReal ave1 = new AguilaReal();
		ave1.volar();
		System.out.println(ave1.tipo);
		
		Aguila ave2 = new AguilaReal();
		ave2.volar();
		System.out.println(ave2.tipo);
		//System.out.println(((AguilaReal)ave2).tipo);

		Ave ave3 = new AguilaReal();
		ave3.volar();
		System.out.println(ave3.tipo);
		
	}

}
