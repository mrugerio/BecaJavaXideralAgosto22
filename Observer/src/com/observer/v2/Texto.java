package com.observer.v2;

public class Texto extends Observer {
	
	String texto;

	public Texto(Subject subject) {
		super(subject);
	}

	void mostrarTexto(String texto) {
		this.texto = texto;
		System.out.println(texto);
	}

	@Override
	void update() {
		mostrarTexto("Hola Mundo");
	}

}
