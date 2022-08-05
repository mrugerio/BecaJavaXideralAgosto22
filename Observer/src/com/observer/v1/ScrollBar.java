package com.observer.v1;

public class ScrollBar extends Observer {
	
	void desplazar() {
		System.out.println("Desplazar ScrollBar");
	}

	@Override
	void update() {
		desplazar();
	}

}
