package com.observer.v2;

public class Gif extends Observer {
	
	String gif;

	public Gif(Subject subject) {
		super(subject);
	}
	
	void mostrarTexto(String gif) {
		this.gif = gif;
		System.out.println(gif);
	}

	@Override
	void update() {
		mostrarTexto("Mostrar Gif");
	}

}
