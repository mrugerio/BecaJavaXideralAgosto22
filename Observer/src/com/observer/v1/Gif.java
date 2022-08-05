package com.observer.v1;

public class Gif extends Observer {
	
	String gif;
	
	void mostrarTexto(String gif) {
		this.gif = gif;
		System.out.println(gif);
	}

	@Override
	void update() {
		mostrarTexto("Mostrar Gif");
	}

}
