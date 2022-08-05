package com.observer.v1;

public class Texto extends Observer {
	
	String texto;
	
	void mostrarTexto(String texto) {
		this.texto = texto;
		System.out.println(texto);
	}

	@Override
	void update() {
		mostrarTexto("Hola Mundo");
	}

}
