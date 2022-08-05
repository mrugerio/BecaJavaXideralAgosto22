package com.observer.v2;

public class Principal {

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		new Texto(mouse);
		new Gif(mouse);
		new ScrollBar(mouse);
		
		mouse.click();
		System.out.println("***");
		
		new Texto(mouse);
		mouse.click();

	}

}
