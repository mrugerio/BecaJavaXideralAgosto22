package com.observer.v1;

public class Principal {

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		
		Gif gif = new Gif();
		
		mouse.atach(new Texto());
		mouse.atach(gif);
		mouse.atach(new ScrollBar());
		mouse.click();
		System.out.println("***");
		mouse.detach(gif);
		mouse.atach(new Texto());
		mouse.click();


		
		
		
	}

}
