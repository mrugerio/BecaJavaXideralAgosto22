package com.curso.v1;

public class Principal {

	//Variable de referencia puede ser de cualquier supertipo
	//del objeto.
	
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.animalSound();
		
		Animal animal2 = new Pig();
		animal2.animalSound();
		
		Animal animal3 = new Dog();
		animal3.animalSound();
		
		Object animal4 = new Pig();
		
		
	}

}
