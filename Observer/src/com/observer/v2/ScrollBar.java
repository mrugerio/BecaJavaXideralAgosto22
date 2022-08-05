package com.observer.v2;

public class ScrollBar extends Observer {
	
	public ScrollBar(Subject subject) {
		super(subject);
	}
	
	void desplazar() {
		System.out.println("Desplazar ScrollBar");
	}

	@Override
	void update() {
		desplazar();
	}

}
